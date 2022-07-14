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
