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

import net.dv8tion.jda.api.events.guild.*;
import net.dv8tion.jda.api.events.guild.member.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildEventListener extends ListenerAdapter {

    @Override public void onGuildReady(@Nonnull GuildReadyEvent event) {}
    @Override public void onGuildTimeout(@Nonnull GuildTimeoutEvent event) {}
    @Override public void onGuildJoin(@Nonnull GuildJoinEvent event) {}
    @Override public void onGuildLeave(@Nonnull GuildLeaveEvent event) {}
    @Override public void onGuildAvailable(@Nonnull GuildAvailableEvent event) {}
    @Override public void onGuildUnavailable(@Nonnull GuildUnavailableEvent event) {}
    @Override public void onUnavailableGuildJoined(@Nonnull UnavailableGuildJoinedEvent event) {}
    @Override public void onUnavailableGuildLeave(@Nonnull UnavailableGuildLeaveEvent event) {}
    @Override public void onGuildBan(@Nonnull GuildBanEvent event) {}
    @Override public void onGuildUnban(@Nonnull GuildUnbanEvent event) {}
    @Override public void onGuildMemberRemove(@Nonnull GuildMemberRemoveEvent event) {}
}
