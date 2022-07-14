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

package com.ericramirezs.kotohimebot.bot.customization;

import com.ericramirezs.commando4j.CommandEngine;
import com.ericramirezs.kotohimebot.domain.service.GuildDataService;
import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
import net.dv8tion.jda.api.events.interaction.GenericInteractionCreateEvent;
import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Objects;

@Component
public class Engine extends CommandEngine {

    @Override
    public Locale getLanguage(@Nullable Event event) {
        return super.getLanguage(event);
    }


    public GuildDataEntity getGuildData(@NotNull GenericGuildEvent event) {
        String guildId = Objects.requireNonNull(event.getGuild()).getId();

        return ((GuildDataService) getRepository()).getGuildData(guildId).orElse(null);
    }

    public GuildDataEntity getGuildData(@NotNull GenericMessageEvent event) {
        String guildId = "-1";
        if (event.isFromGuild()) guildId = event.getGuild().getId();

        return ((GuildDataService) getRepository()).getGuildData(guildId).orElse(null);
    }

    public GuildDataEntity getGuildData(GenericInteractionCreateEvent event) {
        String guildId = "-1";
        if (event.isFromGuild())
            guildId = Objects.requireNonNull(event.getGuild()).getId();

        return ((GuildDataService) getRepository()).getGuildData(guildId).orElse(null);
    }
}
