package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.sticker.GuildStickerAddedEvent;
import net.dv8tion.jda.api.events.sticker.GuildStickerRemovedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildStickerEventListener extends ListenerAdapter {

    @Override
    public void onGuildStickerAdded(@Nonnull GuildStickerAddedEvent event) {
    }

    @Override
    public void onGuildStickerRemoved(@Nonnull GuildStickerRemovedEvent event) {
    }
}
