package com.ericramirezs.kotohimebot.external.api.safebooru;

import com.ericramirezs.kotohimebot.annotations.ExternalService;
import com.ericramirezs.kotohimebot.external.api.rule34.model.Post;
import com.ericramirezs.kotohimebot.external.api.rule34.model.Posts;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Random;

@ExternalService
public class SafebooruService {

    private static SafebooruService instance;

    public static SafebooruService getInstance(){
        return instance;
    }

    @Value("${api.safebooru.baseurl}")
    private String API_URL;
    private WebClient client;

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        client = WebClient.builder().baseUrl(API_URL).build();
        SafebooruService.instance = this;
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
