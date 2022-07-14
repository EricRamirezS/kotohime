package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.guild.voice.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildVoiceEventListener extends ListenerAdapter {

    @Override public void onGuildVoiceUpdate(@Nonnull GuildVoiceUpdateEvent event) {}
    @Override public void onGuildVoiceJoin(@Nonnull GuildVoiceJoinEvent event) {}
    @Override public void onGuildVoiceMove(@Nonnull GuildVoiceMoveEvent event) {}
    @Override public void onGuildVoiceLeave(@Nonnull GuildVoiceLeaveEvent event) {}
    @Override public void onGuildVoiceMute(@Nonnull GuildVoiceMuteEvent event) {}
    @Override public void onGuildVoiceDeafen(@Nonnull GuildVoiceDeafenEvent event) {}
    @Override public void onGuildVoiceGuildMute(@Nonnull GuildVoiceGuildMuteEvent event) {}
    @Override public void onGuildVoiceGuildDeafen(@Nonnull GuildVoiceGuildDeafenEvent event) {}
    @Override public void onGuildVoiceSelfMute(@Nonnull GuildVoiceSelfMuteEvent event) {}
    @Override public void onGuildVoiceSelfDeafen(@Nonnull GuildVoiceSelfDeafenEvent event) {}
    @Override public void onGuildVoiceSuppress(@Nonnull GuildVoiceSuppressEvent event) {}
    @Override public void onGuildVoiceStream(@Nonnull GuildVoiceStreamEvent event) {}
    @Override public void onGuildVoiceVideo(@Nonnull GuildVoiceVideoEvent event) {}
    @Override public void onGuildVoiceRequestToSpeak(@Nonnull GuildVoiceRequestToSpeakEvent event) {}
}
