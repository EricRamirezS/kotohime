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

package com.ericramirezs.kotohimebot.external.api.rule34.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "posts")
public class Posts {
    private List<Post> post;
    private int count;
    private int offset;

    @XmlElement(name = "post")
    public List<Post> getpost() {
        return this.post; }

    public void setpost(List<Post> post) {
        this.post = post; }

    @XmlAttribute
    public int getcount() {
        return this.count; }

    public void setcount(int count) {
        this.count = count; }

    @XmlAttribute
    public int getoffset() {
        return this.offset; }

    public void setoffset(int offset) {
        this.offset = offset; }
}
