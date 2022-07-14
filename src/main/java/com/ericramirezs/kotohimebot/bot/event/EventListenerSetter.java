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

package com.ericramirezs.kotohimebot.bot.event;

import com.ericramirezs.kotohimebot.bot.event.listener.*;
import net.dv8tion.jda.api.JDABuilder;
import org.jetbrains.annotations.NotNull;

public class EventListenerSetter {

    private EventListenerSetter(){}

    public static void setListeners(@NotNull JDABuilder jdaB){
        jdaB.addEventListeners(
                new ApplicationCommandEventListener(),

                new GenericEventListener(),

                new GuildEventListener(),
                new GuildUpdateEventListener(),

                new GuildChannelEventListener(),
                new GuildChannelUpdateEventListener(),

                new GuildEmojiEventListener(),
                new GuildEmojiUpdateEventListener(),

                new GuildInviteEventListener(),

                new GuildMemberEventListener(),
                new GuildMemberUpdateEventListener(),

                new GuildRoleEventListener(),
                new GuildRoleUpdateEventListener(),

                new GuildStageInstanceEventListener(),

                new GuildStickerEventListener(),
                new GuildStickerUpdateEventListener(),

                new GuildThreadEventListener(),
                new GuildThreadMemberEventListener(),

                new GuildVoiceEventListener(),

                new InteractionEventListener(),

                new JDAEventListener(),

                new MessageEventListener(),

                new PermissionEventListener(),

                new UserEventListener()
        );
    }
}
