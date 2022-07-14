package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.emoji.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildEmojiEventListener extends ListenerAdapter {

    @Override public void onEmojiAdded(@Nonnull EmojiAddedEvent event) {}
    @Override public void onEmojiRemoved(@Nonnull EmojiRemovedEvent event) {}

}
