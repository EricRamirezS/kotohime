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

import net.dv8tion.jda.api.events.user.*;
import net.dv8tion.jda.api.events.user.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class UserEventListener extends ListenerAdapter {

    @Override public void onUserUpdateName(@Nonnull UserUpdateNameEvent event) {}
    @Override public void onUserUpdateDiscriminator(@Nonnull UserUpdateDiscriminatorEvent event) {}
    @Override public void onUserUpdateAvatar(@Nonnull UserUpdateAvatarEvent event) {}
    @Override public void onUserUpdateOnlineStatus(@Nonnull UserUpdateOnlineStatusEvent event) {}
    @Override public void onUserUpdateActivityOrder(@Nonnull UserUpdateActivityOrderEvent event) {}
    @Override public void onUserUpdateFlags(@Nonnull UserUpdateFlagsEvent event) {}
    @Override public void onUserTyping(@Nonnull UserTypingEvent event) {}
    @Override public void onUserActivityStart(@Nonnull UserActivityStartEvent event) {}
    @Override public void onUserActivityEnd(@Nonnull UserActivityEndEvent event) {}
    @Override public void onUserUpdateActivities(@Nonnull UserUpdateActivitiesEvent event) {}
}
