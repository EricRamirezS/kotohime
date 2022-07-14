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

import net.dv8tion.jda.api.events.role.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildRoleUpdateEventListener extends ListenerAdapter {
    @Override public void onRoleUpdateColor(@Nonnull RoleUpdateColorEvent event) {}
    @Override public void onRoleUpdateHoisted(@Nonnull RoleUpdateHoistedEvent event) {}
    @Override public void onRoleUpdateIcon(@Nonnull RoleUpdateIconEvent event) {}
    @Override public void onRoleUpdateMentionable(@Nonnull RoleUpdateMentionableEvent event) {}
    @Override public void onRoleUpdateName(@Nonnull RoleUpdateNameEvent event) {}
    @Override public void onRoleUpdatePermissions(@Nonnull RoleUpdatePermissionsEvent event) {}
    @Override public void onRoleUpdatePosition(@Nonnull RoleUpdatePositionEvent event) {}
}
