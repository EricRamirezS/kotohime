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

import net.dv8tion.jda.api.events.guild.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildUpdateEventListener extends ListenerAdapter {

    @Override public void onGuildUpdateAfkChannel(@Nonnull GuildUpdateAfkChannelEvent event) {}
    @Override public void onGuildUpdateSystemChannel(@Nonnull GuildUpdateSystemChannelEvent event) {}
    @Override public void onGuildUpdateRulesChannel(@Nonnull GuildUpdateRulesChannelEvent event) {}
    @Override public void onGuildUpdateCommunityUpdatesChannel(@Nonnull GuildUpdateCommunityUpdatesChannelEvent event) {}
    @Override public void onGuildUpdateAfkTimeout(@Nonnull GuildUpdateAfkTimeoutEvent event) {}
    @Override public void onGuildUpdateExplicitContentLevel(@Nonnull GuildUpdateExplicitContentLevelEvent event) {}
    @Override public void onGuildUpdateIcon(@Nonnull GuildUpdateIconEvent event) {}
    @Override public void onGuildUpdateMFALevel(@Nonnull GuildUpdateMFALevelEvent event) {}
    @Override public void onGuildUpdateName(@Nonnull GuildUpdateNameEvent event){}
    @Override public void onGuildUpdateNotificationLevel(@Nonnull GuildUpdateNotificationLevelEvent event) {}
    @Override public void onGuildUpdateOwner(@Nonnull GuildUpdateOwnerEvent event) {}
    @Override public void onGuildUpdateSplash(@Nonnull GuildUpdateSplashEvent event) {}
    @Override public void onGuildUpdateVerificationLevel(@Nonnull GuildUpdateVerificationLevelEvent event) {}
    @Override public void onGuildUpdateLocale(@Nonnull GuildUpdateLocaleEvent event) {}
    @Override public void onGuildUpdateFeatures(@Nonnull GuildUpdateFeaturesEvent event) {}
    @Override public void onGuildUpdateVanityCode(@Nonnull GuildUpdateVanityCodeEvent event) {}
    @Override public void onGuildUpdateBanner(@Nonnull GuildUpdateBannerEvent event) {}
    @Override public void onGuildUpdateDescription(@Nonnull GuildUpdateDescriptionEvent event) {}
    @Override public void onGuildUpdateBoostTier(@Nonnull GuildUpdateBoostTierEvent event) {}
    @Override public void onGuildUpdateBoostCount(@Nonnull GuildUpdateBoostCountEvent event) {}
    @Override public void onGuildUpdateMaxMembers(@Nonnull GuildUpdateMaxMembersEvent event) {}
    @Override public void onGuildUpdateMaxPresences(@Nonnull GuildUpdateMaxPresencesEvent event) {}
    @Override public void onGuildUpdateNSFWLevel(@Nonnull GuildUpdateNSFWLevelEvent event) {}

}
