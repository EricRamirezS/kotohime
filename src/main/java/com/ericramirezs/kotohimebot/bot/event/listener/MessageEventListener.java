package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.message.*;
import net.dv8tion.jda.api.events.message.react.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class MessageEventListener extends ListenerAdapter {

    @Override public void onMessageReceived(@Nonnull MessageReceivedEvent event) {}
    @Override public void onMessageUpdate(@Nonnull MessageUpdateEvent event) {}
    @Override public void onMessageDelete(@Nonnull MessageDeleteEvent event) {}
    @Override public void onMessageBulkDelete(@Nonnull MessageBulkDeleteEvent event) {}
    @Override public void onMessageEmbed(@Nonnull MessageEmbedEvent event) {}
    @Override public void onMessageReactionAdd(@Nonnull MessageReactionAddEvent event) {}
    @Override public void onMessageReactionRemove(@Nonnull MessageReactionRemoveEvent event) {}
    @Override public void onMessageReactionRemoveAll(@Nonnull MessageReactionRemoveAllEvent event) {}
    @Override public void onMessageReactionRemoveEmoji(@Nonnull MessageReactionRemoveEmojiEvent event) {}
}
