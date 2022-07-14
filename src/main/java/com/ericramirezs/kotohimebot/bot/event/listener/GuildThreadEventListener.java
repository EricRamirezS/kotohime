package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.thread.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildThreadEventListener extends ListenerAdapter {

    @Override public void onThreadRevealed(@Nonnull ThreadRevealedEvent event) {}
    @Override public void onThreadHidden(@Nonnull ThreadHiddenEvent event) {}

}
