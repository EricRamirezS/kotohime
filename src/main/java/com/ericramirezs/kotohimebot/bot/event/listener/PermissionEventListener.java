package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.guild.override.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class PermissionEventListener extends ListenerAdapter {

    @Override public void onPermissionOverrideDelete(@Nonnull PermissionOverrideDeleteEvent event) {}
    @Override public void onPermissionOverrideUpdate(@Nonnull PermissionOverrideUpdateEvent event) {}
    @Override public void onPermissionOverrideCreate(@Nonnull PermissionOverrideCreateEvent event) {}

}
