package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.interaction.command.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class ApplicationCommandEventListener extends ListenerAdapter {

    @Override public void onGenericPrivilegeUpdate(@Nonnull GenericPrivilegeUpdateEvent event) {}
    @Override public void onApplicationCommandUpdatePrivileges(@Nonnull ApplicationCommandUpdatePrivilegesEvent event) {}
    @Override public void onApplicationUpdatePrivileges(@Nonnull ApplicationUpdatePrivilegesEvent event) {}

}
