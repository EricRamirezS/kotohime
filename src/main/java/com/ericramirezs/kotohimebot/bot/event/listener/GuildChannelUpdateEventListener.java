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

import net.dv8tion.jda.api.events.channel.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildChannelUpdateEventListener extends ListenerAdapter {

    @Override public void onChannelUpdateBitrate(@Nonnull ChannelUpdateBitrateEvent event) {}
    @Override public void onChannelUpdateName(@Nonnull ChannelUpdateNameEvent event) {}
    @Override public void onChannelUpdateNSFW(@Nonnull ChannelUpdateNSFWEvent event) {}
    @Override public void onChannelUpdateParent(@Nonnull ChannelUpdateParentEvent event) {}
    @Override public void onChannelUpdatePosition(@Nonnull ChannelUpdatePositionEvent event) {}
    @Override public void onChannelUpdateRegion(@Nonnull ChannelUpdateRegionEvent event) {}
    @Override public void onChannelUpdateSlowmode(@Nonnull ChannelUpdateSlowmodeEvent event) {}
    @Override public void onChannelUpdateTopic(@Nonnull ChannelUpdateTopicEvent event) {}
    @Override public void onChannelUpdateType(@Nonnull ChannelUpdateTypeEvent event) {}
    @Override public void onChannelUpdateUserLimit(@Nonnull ChannelUpdateUserLimitEvent event) {}
    @Override public void onChannelUpdateArchived(@Nonnull ChannelUpdateArchivedEvent event) {}
    @Override public void onChannelUpdateArchiveTimestamp(@Nonnull ChannelUpdateArchiveTimestampEvent event) {}
    @Override public void onChannelUpdateAutoArchiveDuration(@Nonnull ChannelUpdateAutoArchiveDurationEvent event) {}
    @Override public void onChannelUpdateLocked(@Nonnull ChannelUpdateLockedEvent event) {}
    @Override public void onChannelUpdateInvitable(@Nonnull ChannelUpdateInvitableEvent event) {}
}
