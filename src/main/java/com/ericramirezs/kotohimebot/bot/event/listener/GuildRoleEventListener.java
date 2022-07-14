package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.role.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildRoleEventListener extends ListenerAdapter {

    @Override public void onRoleCreate(@Nonnull RoleCreateEvent event) {}
    @Override public void onRoleDelete(@Nonnull RoleDeleteEvent event) {}

}
