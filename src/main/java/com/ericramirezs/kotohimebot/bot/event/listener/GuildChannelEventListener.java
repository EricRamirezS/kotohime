package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.channel.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildChannelEventListener extends ListenerAdapter {

    @Override public void onChannelCreate(@Nonnull ChannelCreateEvent event) {}
    @Override public void onChannelDelete(@Nonnull ChannelDeleteEvent event) {}

}
