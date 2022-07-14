package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.GatewayPingEvent;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.RawGatewayEvent;
import net.dv8tion.jda.api.events.UpdateEvent;
import net.dv8tion.jda.api.events.channel.GenericChannelEvent;
import net.dv8tion.jda.api.events.channel.update.GenericChannelUpdateEvent;
import net.dv8tion.jda.api.events.emoji.GenericEmojiEvent;
import net.dv8tion.jda.api.events.emoji.update.GenericEmojiUpdateEvent;
import net.dv8tion.jda.api.events.guild.GenericGuildEvent;
import net.dv8tion.jda.api.events.guild.invite.GenericGuildInviteEvent;
import net.dv8tion.jda.api.events.guild.member.GenericGuildMemberEvent;
import net.dv8tion.jda.api.events.guild.member.update.GenericGuildMemberUpdateEvent;
import net.dv8tion.jda.api.events.guild.override.GenericPermissionOverrideEvent;
import net.dv8tion.jda.api.events.guild.update.GenericGuildUpdateEvent;
import net.dv8tion.jda.api.events.guild.voice.GenericGuildVoiceEvent;
import net.dv8tion.jda.api.events.interaction.GenericAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.GenericInteractionCreateEvent;
import net.dv8tion.jda.api.events.interaction.command.GenericCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.GenericContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.GenericComponentInteractionCreateEvent;
import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import net.dv8tion.jda.api.events.message.react.GenericMessageReactionEvent;
import net.dv8tion.jda.api.events.role.GenericRoleEvent;
import net.dv8tion.jda.api.events.role.update.GenericRoleUpdateEvent;
import net.dv8tion.jda.api.events.self.GenericSelfUpdateEvent;
import net.dv8tion.jda.api.events.stage.GenericStageInstanceEvent;
import net.dv8tion.jda.api.events.stage.update.GenericStageInstanceUpdateEvent;
import net.dv8tion.jda.api.events.sticker.GenericGuildStickerEvent;
import net.dv8tion.jda.api.events.sticker.update.GenericGuildStickerUpdateEvent;
import net.dv8tion.jda.api.events.thread.GenericThreadEvent;
import net.dv8tion.jda.api.events.thread.member.GenericThreadMemberEvent;
import net.dv8tion.jda.api.events.user.GenericUserEvent;
import net.dv8tion.jda.api.events.user.update.GenericUserPresenceEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GenericEventListener extends ListenerAdapter {

    @Override
    public void onGenericEvent(@Nonnull GenericEvent event) {
    }

    @Override
    public void onGenericUpdate(@Nonnull UpdateEvent<?, ?> event) {
    }

    @Override
    public void onRawGateway(@Nonnull RawGatewayEvent event) {
    }

    @Override
    public void onGatewayPing(@Nonnull GatewayPingEvent event) {
    }


    @Override public void onGenericInteractionCreate(@Nonnull GenericInteractionCreateEvent event) {}
    @Override public void onGenericAutoCompleteInteraction(@Nonnull GenericAutoCompleteInteractionEvent event) {}
    @Override public void onGenericComponentInteractionCreate(@Nonnull GenericComponentInteractionCreateEvent event) {}
    @Override public void onGenericCommandInteraction(@Nonnull GenericCommandInteractionEvent event) {}
    @Override public void onGenericContextInteraction(@Nonnull GenericContextInteractionEvent<?> event) {}
    @Override public void onGenericMessage(@Nonnull GenericMessageEvent event) {}
    @Override public void onGenericMessageReaction(@Nonnull GenericMessageReactionEvent event) {}
    @Override public void onGenericUser(@Nonnull GenericUserEvent event) {}
    @Override public void onGenericUserPresence(@Nonnull GenericUserPresenceEvent event) {}
    @Override public void onGenericSelfUpdate(@Nonnull GenericSelfUpdateEvent event) {}
    @Override public void onGenericStageInstance(@Nonnull GenericStageInstanceEvent event) {}
    @Override public void onGenericStageInstanceUpdate(@Nonnull GenericStageInstanceUpdateEvent event) {}
    @Override public void onGenericChannel(@Nonnull GenericChannelEvent event) {}
    @Override public void onGenericChannelUpdate(@Nonnull GenericChannelUpdateEvent<?> event) {}
    @Override public void onGenericThread(@Nonnull GenericThreadEvent event) {}
    @Override public void onGenericThreadMember(@Nonnull GenericThreadMemberEvent event) {}
    @Override public void onGenericGuild(@Nonnull GenericGuildEvent event) {}
    @Override public void onGenericGuildUpdate(@Nonnull GenericGuildUpdateEvent event) {}
    @Override public void onGenericGuildInvite(@Nonnull GenericGuildInviteEvent event) {}
    @Override public void onGenericGuildMember(@Nonnull GenericGuildMemberEvent event) {}
    @Override public void onGenericGuildMemberUpdate(@Nonnull GenericGuildMemberUpdateEvent event) {}
    @Override public void onGenericGuildVoice(@Nonnull GenericGuildVoiceEvent event) {}
    @Override public void onGenericRole(@Nonnull GenericRoleEvent event) {}
    @Override public void onGenericRoleUpdate(@Nonnull GenericRoleUpdateEvent event) {}
    @Override public void onGenericEmoji(@Nonnull GenericEmojiEvent event) {}
    @Override public void onGenericEmojiUpdate(@Nonnull GenericEmojiUpdateEvent event) {}
    @Override public void onGenericGuildSticker(@Nonnull GenericGuildStickerEvent event) {}
    @Override public void onGenericGuildStickerUpdate(@Nonnull GenericGuildStickerUpdateEvent event) {}
    @Override public void onGenericPermissionOverride(@Nonnull GenericPermissionOverrideEvent event) {}


}
