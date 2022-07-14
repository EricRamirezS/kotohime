package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.guild.*;
import net.dv8tion.jda.api.events.guild.member.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildEventListener extends ListenerAdapter {

    @Override public void onGuildReady(@Nonnull GuildReadyEvent event) {}
    @Override public void onGuildTimeout(@Nonnull GuildTimeoutEvent event) {}
    @Override public void onGuildJoin(@Nonnull GuildJoinEvent event) {}
    @Override public void onGuildLeave(@Nonnull GuildLeaveEvent event) {}
    @Override public void onGuildAvailable(@Nonnull GuildAvailableEvent event) {}
    @Override public void onGuildUnavailable(@Nonnull GuildUnavailableEvent event) {}
    @Override public void onUnavailableGuildJoined(@Nonnull UnavailableGuildJoinedEvent event) {}
    @Override public void onUnavailableGuildLeave(@Nonnull UnavailableGuildLeaveEvent event) {}
    @Override public void onGuildBan(@Nonnull GuildBanEvent event) {}
    @Override public void onGuildUnban(@Nonnull GuildUnbanEvent event) {}
    @Override public void onGuildMemberRemove(@Nonnull GuildMemberRemoveEvent event) {}
}
