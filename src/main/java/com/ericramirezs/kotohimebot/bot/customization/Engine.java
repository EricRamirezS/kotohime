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
