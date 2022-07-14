package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.sticker.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildStickerUpdateEventListener extends ListenerAdapter {

    @Override
    public void onGuildStickerUpdateName(@Nonnull GuildStickerUpdateNameEvent event) {
    }

    @Override
    public void onGuildStickerUpdateTags(@Nonnull GuildStickerUpdateTagsEvent event) {
    }

    @Override
    public void onGuildStickerUpdateDescription(@Nonnull GuildStickerUpdateDescriptionEvent event) {
    }

    @Override
    public void onGuildStickerUpdateAvailable(@Nonnull GuildStickerUpdateAvailableEvent event) {
    }
}
