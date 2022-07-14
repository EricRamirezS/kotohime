package com.ericramirezs.kotohimebot.bot.event.listener;

import com.ericramirezs.commando4j.CommandEngine;
import com.ericramirezs.commando4j.util.DateTimeUtils;
import com.ericramirezs.commando4j.util.StringUtils;
import com.ericramirezs.kotohimebot.bot.customization.Engine;
import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.TimeFormat;
import net.dv8tion.jda.internal.utils.PermissionUtil;

import javax.annotation.Nonnull;
import java.text.MessageFormat;
import java.time.OffsetDateTime;

public class GuildMemberEventListener extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(@Nonnull GuildMemberJoinEvent event) {
        sendWelcomeMessage(event);
    }

    @Override
    public void onGuildMemberRoleAdd(@Nonnull GuildMemberRoleAddEvent event) {
    }

    @Override
    public void onGuildMemberRoleRemove(@Nonnull GuildMemberRoleRemoveEvent event) {
    }


    private void sendWelcomeMessage(@Nonnull GuildMemberJoinEvent event) {
        GuildDataEntity data = ((Engine) CommandEngine.getInstance()).getGuildData(event);
        String channelId = data.getWelcomeChannelId();
        if (StringUtils.isNullOrWhiteSpace(channelId)) {
            return;
        }
        Guild guild = event.getGuild();
        TextChannel channel = guild.getTextChannels().stream()
                .filter(c -> c.getId().equals(channelId))
                .findFirst().orElse(null);
        if (channel == null) return;

        String msg = data.getWelcomeMessage();

        if (StringUtils.isNullOrWhiteSpace(msg)) {
            //TOOD: Replace msg with default;
        }

        OffsetDateTime dateTime = OffsetDateTime.now();
        Member owner = guild.retrieveOwner().complete();


        // {0} new Member's name
        // {1} new Member's Mention
        // {2} Server's name
        // {3} Joined Date short
        // {4} Joined Date Long
        // {5} Joined Time short
        // {6} Joined Time long
        // {7} Joined Datetime short
        // {8} Joined Datetime long
        // {9} Joined Relative Date
        // {10} Server's owner Name
        // {11} Server's owner as Mention
        msg = MessageFormat.format(msg,
                event.getMember().getEffectiveName(),
                event.getMember().getAsMention(),
                guild.getName(),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.DATE_SHORT),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.DATE_LONG),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.TIME_SHORT),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.TIME_LONG),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.DATE_TIME_SHORT),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.DATE_TIME_LONG),
                DateTimeUtils.toDiscordTimeStamp(dateTime, TimeFormat.RELATIVE),
                owner != null ? owner.getEffectiveName() : "",
                owner != null ? owner.getAsMention() : ""
        );


        Member member = event.getMember();
        if (PermissionUtil.checkPermission(
                channel.getPermissionContainer(),
                event.getGuild().getSelfMember(),
                Permission.MESSAGE_SEND)) {
            channel.sendMessage(msg).queue();
            return;
        }

        String finalMsg = msg;
        member.getUser().openPrivateChannel()
                .flatMap((c) -> c.sendMessage(finalMsg))
                .onErrorMap((throwable) -> null)
                .queue();
    }
}
