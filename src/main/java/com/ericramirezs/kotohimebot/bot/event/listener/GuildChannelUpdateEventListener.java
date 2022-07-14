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
