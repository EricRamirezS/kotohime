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
