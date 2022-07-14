package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.guild.invite.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildInviteEventListener extends ListenerAdapter {

    @Override public void onGuildInviteCreate(@Nonnull GuildInviteCreateEvent event) {}
    @Override public void onGuildInviteDelete(@Nonnull GuildInviteDeleteEvent event) {}

}
