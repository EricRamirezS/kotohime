package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.thread.member.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildThreadMemberEventListener extends ListenerAdapter {

    @Override public void onThreadMemberJoin(@Nonnull ThreadMemberJoinEvent event) {}
    @Override public void onThreadMemberLeave(@Nonnull ThreadMemberLeaveEvent event) {}

}
