/*
 * Copyright (C) 2022  Eric Bastian Ramírez Santis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ericramirezs.kotohimebot.external.api.saucenao;

import com.ericramirezs.kotohimebot.annotations.ExternalService;
import com.ericramirezs.kotohimebot.external.api.rule34.Rule34Service;
import com.ericramirezs.kotohimebot.external.api.rule34.model.Post;
import com.ericramirezs.kotohimebot.external.api.rule34.model.Posts;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Random;

@ExternalService
public class SaucenaoService {

    private static SaucenaoService instance;

    public static SaucenaoService getInstance(){
        return instance;
    }

    @Value("${api.saucenao.baseurl}")
    private String API_URL;
    @Value("${api.saucenao.key}")
    private String API_KEY;
    private WebClient client;

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        client = WebClient.builder().baseUrl(API_URL).build();
        SaucenaoService.instance = this;
    }

    public @Nullable String getImageLink(String[] tags) {
        try {
            final Random r = new Random();

            String queryTags = String.join("+",tags);
            int total = get(0,queryTags,0).getcount();
            Posts posts = get(1,queryTags,r.nextInt(total));
            List<Post> post = posts.getpost();
            if (post.size() > 0){
                return post.get(0).getFileUrl();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private Posts get(int limit, String tags, int pid) {
        return client.get().uri(ub -> ub
                        .queryParam("page", "dapi")
                        .queryParam("s", "post")
                        .queryParam("q", "index")
                        .queryParam("limit", limit)
                        .queryParam("pid", pid)
                        .queryParam("tags", tags)
                        .build())
                .retrieve()
                .bodyToMono(Posts.class)
                .block();
    }
}
