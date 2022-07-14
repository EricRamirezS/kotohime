package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.emoji.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildEmojiUpdateEventListener extends ListenerAdapter {

    @Override public void onEmojiUpdateName(@Nonnull EmojiUpdateNameEvent event) {}
    @Override public void onEmojiUpdateRoles(@Nonnull EmojiUpdateRolesEvent event) {}

}
