/*
 * Copyright (C) 2022  Eric Bastian Ramírez Santis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
