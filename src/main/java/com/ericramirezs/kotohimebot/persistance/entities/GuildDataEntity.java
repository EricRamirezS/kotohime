package com.ericramirezs.kotohimebot.persistance.entities;

import com.ericramirezs.commando4j.util.StringUtils;
import com.google.gson.Gson;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "guild_data", schema = "public")
public class GuildDataEntity {

    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "language", nullable = false, length = 8)
    private String language;
    @Basic
    @Column(name = "prefix", nullable = false, length = 8)
    private String prefix;
    @Basic
    @Column(name = "nsfw", nullable = false)
    private Boolean nsfw;
    @Basic
    @Column(name = "welcome_channel_id", length = 32)
    private String welcomeChannelId;
    @Basic
    @Column(name = "development_news_channel_id", length = 32)
    private String developmentNewsChannelId;
    @Basic
    @Column(name = "voice_log_id", length = 32)
    private String voiceLogId;
    @Basic
    @Column(name = "roles_list")
    private String rolesList;
    @Basic
    @Column(name = "allowed_categories_list")
    private String allowedCategoriesList;
    @Basic
    @Column(name = "welcome_message", length = 1980)
    private String welcomeMessage;
    @Basic
    @Column(name = "language_from_suffix", nullable = false)
    private Boolean languageFromSuffix;
    @Basic
    @Column(name = "join_date", columnDefinition = "TIMESTAMP WITH TIME ZONE", nullable = false)
    private OffsetDateTime joinDate;

    public Boolean getNsfw() {
        return nsfw;
    }

    public GuildDataEntity setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
        return this;
    }

    public Boolean getLanguageFromSuffix() {
        return languageFromSuffix;
    }

    public GuildDataEntity setLanguageFromSuffix(boolean languageFromSuffix) {
        this.languageFromSuffix = languageFromSuffix;
        return this;
    }

    public GuildDataEntity setLanguageFromSuffix(Boolean languageFromSuffix) {
        this.languageFromSuffix = languageFromSuffix;
        return this;
    }

    public String getId() {
        return id;
    }

    public GuildDataEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public GuildDataEntity setLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getPrefix() {
        return prefix;
    }

    public GuildDataEntity setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public GuildDataEntity setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
        return this;
    }

    public String getWelcomeChannelId() {
        return welcomeChannelId;
    }

    public GuildDataEntity setWelcomeChannelId(String welcomeChannelId) {
        this.welcomeChannelId = welcomeChannelId;
        return this;
    }

    public String getDevelopmentNewsChannelId() {
        return developmentNewsChannelId;
    }

    public GuildDataEntity setDevelopmentNewsChannelId(String developmentNewsChannelId) {
        this.developmentNewsChannelId = developmentNewsChannelId;
        return this;
    }

    public String getVoiceLogId() {
        return voiceLogId;
    }

    public GuildDataEntity setVoiceLogId(String voiceLogId) {
        this.voiceLogId = voiceLogId;
        return this;
    }

    public String[] getRolesList() {
        if (StringUtils.isNullOrWhiteSpace(rolesList)) return new String[]{};
        return new Gson().fromJson(rolesList, String[].class);
    }

    public GuildDataEntity setRolesList(String[] rolesList) {
        this.rolesList = new Gson().toJson(rolesList);
        return this;
    }

    public String[] getAllowedCategoriesList() {
        if (StringUtils.isNullOrWhiteSpace(allowedCategoriesList)) return new String[]{};
        return new Gson().fromJson(allowedCategoriesList, String[].class);
    }

    public GuildDataEntity setAllowedCategoriesList(String[] allowedCategoriesList) {
        this.allowedCategoriesList = new Gson().toJson(allowedCategoriesList);
        return this;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public GuildDataEntity setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }

    public Boolean isLanguageFromSuffix() {
        return languageFromSuffix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuildDataEntity that = (GuildDataEntity) o;
        return nsfw == that.nsfw && languageFromSuffix == that.languageFromSuffix && Objects.equals(id, that.id) && Objects.equals(language, that.language) && Objects.equals(prefix, that.prefix) && Objects.equals(welcomeChannelId, that.welcomeChannelId) && Objects.equals(developmentNewsChannelId, that.developmentNewsChannelId) && Objects.equals(voiceLogId, that.voiceLogId) && Objects.equals(rolesList, that.rolesList) && Objects.equals(allowedCategoriesList, that.allowedCategoriesList) && Objects.equals(welcomeMessage, that.welcomeMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, language, prefix, nsfw, welcomeChannelId, developmentNewsChannelId, voiceLogId, rolesList, allowedCategoriesList, welcomeMessage, languageFromSuffix);
    }

    public Object getJoinDate() {
        return joinDate;
    }

    public GuildDataEntity setJoinDate(OffsetDateTime joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GuildDataEntity.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("language='" + language + "'")
                .add("prefix='" + prefix + "'")
                .add("nsfw=" + nsfw)
                .add("welcomeChannelId='" + welcomeChannelId + "'")
                .add("developmentNewsChannelId='" + developmentNewsChannelId + "'")
                .add("voiceLogId='" + voiceLogId + "'")
                .add("rolesList='" + rolesList + "'")
                .add("allowedCategoriesList='" + allowedCategoriesList + "'")
                .add("welcomeMessage='" + welcomeMessage + "'")
                .add("languageFromSuffix=" + languageFromSuffix)
                .add("joinDate=" + joinDate)
                .toString();
    }
}
