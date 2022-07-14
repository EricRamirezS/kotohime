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

import net.dv8tion.jda.api.events.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class JDAEventListener extends ListenerAdapter {

    @Override public void onReady(@Nonnull ReadyEvent event) {}
    @Override public void onResumed(@Nonnull ResumedEvent event) {}
    @Override public void onReconnected(@Nonnull ReconnectedEvent event) {}
    @Override public void onDisconnect(@Nonnull DisconnectEvent event) {}
    @Override public void onShutdown(@Nonnull ShutdownEvent event) {}
    @Override public void onStatusChange(@Nonnull StatusChangeEvent event) {}
    @Override public void onException(@Nonnull ExceptionEvent event) {}

}
