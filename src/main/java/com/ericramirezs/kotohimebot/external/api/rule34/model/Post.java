package com.ericramirezs.kotohimebot.external.api.rule34.model;

import com.ericramirezs.kotohimebot.external.api.rule34.adapter.DateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.OffsetDateTime;

@XmlRootElement(name = "post")
@XmlAccessorType(XmlAccessType.FIELD)
public class Post {
    @XmlAttribute(name = "height")
    private int height;
    @XmlAttribute(name = "score")
    private int score;
    @XmlAttribute(name = "file_url")
    private String fileUrl;
    @XmlAttribute(name = "parent_id")
    private String parentId;
    @XmlAttribute(name = "sample_url")
    private String sampleUrl;
    @XmlAttribute(name = "sample_width")
    private int sampleWidth;
    @XmlAttribute(name = "sample_height")
    private int sampleHeight;
    @XmlAttribute(name = "preview_url")
    private String previewUrl;
    @XmlAttribute(name = "rating")
    private String rating;
    @XmlAttribute(name = "tags")
    private String tags;
    @XmlAttribute(name = "id")
    private int id;
    @XmlAttribute(name = "width")
    private int width;
    @XmlAttribute(name = "change")
    private int change;
    @XmlAttribute(name = "md5")
    private String md5;
    @XmlAttribute(name = "creator_id")
    private int creatorId;
    @XmlAttribute(name = "has_children")
    private boolean hasChildren;
    @XmlAttribute(name = "created_at")
    @XmlJavaTypeAdapter(DateAdapter.class)
    private OffsetDateTime createdAt;
    @XmlAttribute(name = "status")
    private String status;
    @XmlAttribute(name = "source")
    private String source;
    @XmlAttribute(name = "has_notes")
    private boolean hasNotes;
    @XmlAttribute(name = "has_comments")
    private boolean hasComments;
    @XmlAttribute(name = "preview_width")
    private int previewWidth;
    @XmlAttribute(name = "preview_height")
    private int previewHeight;

    public int getHeight() {
        return height;
    }

    public Post setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Post setScore(int score) {
        this.score = score;
        return this;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public Post setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public Post setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getSampleUrl() {
        return sampleUrl;
    }

    public Post setSampleUrl(String sampleUrl) {
        this.sampleUrl = sampleUrl;
        return this;
    }

    public int getSampleWidth() {
        return sampleWidth;
    }

    public Post setSampleWidth(int sampleWidth) {
        this.sampleWidth = sampleWidth;
        return this;
    }

    public int getSampleHeight() {
        return sampleHeight;
    }

    public Post setSampleHeight(int sampleHeight) {
        this.sampleHeight = sampleHeight;
        return this;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public Post setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public Post setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public Post setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public int getId() {
        return id;
    }

    public Post setId(int id) {
        this.id = id;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Post setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getChange() {
        return change;
    }

    public Post setChange(int change) {
        this.change = change;
        return this;
    }

    public String getMd5() {
        return md5;
    }

    public Post setMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public Post setCreatorId(int creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public Post setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public Post setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Post setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Post setSource(String source) {
        this.source = source;
        return this;
    }

    public boolean isHasNotes() {
        return hasNotes;
    }

    public Post setHasNotes(boolean hasNotes) {
        this.hasNotes = hasNotes;
        return this;
    }

    public boolean isHasComments() {
        return hasComments;
    }

    public Post setHasComments(boolean hasComments) {
        this.hasComments = hasComments;
        return this;
    }

    public int getPreviewWidth() {
        return previewWidth;
    }

    public Post setPreviewWidth(int previewWidth) {
        this.previewWidth = previewWidth;
        return this;
    }

    public int getPreviewHeight() {
        return previewHeight;
    }

    public Post setPreviewHeight(int previewHeight) {
        this.previewHeight = previewHeight;
        return this;
    }
}
