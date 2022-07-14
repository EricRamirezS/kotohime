package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.guild.member.GuildMemberUpdateEvent;
import net.dv8tion.jda.api.events.guild.member.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildMemberUpdateEventListener extends ListenerAdapter {

    @Override public void onGuildMemberUpdate(@Nonnull GuildMemberUpdateEvent event) {}
    @Override public void onGuildMemberUpdateNickname(@Nonnull GuildMemberUpdateNicknameEvent event) {}
    @Override public void onGuildMemberUpdateAvatar(@Nonnull GuildMemberUpdateAvatarEvent event) {}
    @Override public void onGuildMemberUpdateBoostTime(@Nonnull GuildMemberUpdateBoostTimeEvent event) {}
    @Override public void onGuildMemberUpdatePending(@Nonnull GuildMemberUpdatePendingEvent event) {}
    @Override public void onGuildMemberUpdateTimeOut(@Nonnull GuildMemberUpdateTimeOutEvent event) {}
}
