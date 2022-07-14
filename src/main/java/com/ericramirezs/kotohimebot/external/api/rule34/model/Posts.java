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
