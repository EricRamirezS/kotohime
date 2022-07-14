package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.*;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class InteractionEventListener extends ListenerAdapter {

    @Override public void onSlashCommandInteraction(@Nonnull SlashCommandInteractionEvent event) {}
    @Override public void onUserContextInteraction(@Nonnull UserContextInteractionEvent event) {}
    @Override public void onMessageContextInteraction(@Nonnull MessageContextInteractionEvent event) {}
    @Override public void onButtonInteraction(@Nonnull ButtonInteractionEvent event) {}
    @Override public void onSelectMenuInteraction(@Nonnull SelectMenuInteractionEvent event) {}
    @Override public void onCommandAutoCompleteInteraction(@Nonnull CommandAutoCompleteInteractionEvent event) {}
    @Override public void onModalInteraction(@Nonnull ModalInteractionEvent event) {}
}
