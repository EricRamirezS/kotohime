package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.user.*;
import net.dv8tion.jda.api.events.user.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class UserEventListener extends ListenerAdapter {

    @Override public void onUserUpdateName(@Nonnull UserUpdateNameEvent event) {}
    @Override public void onUserUpdateDiscriminator(@Nonnull UserUpdateDiscriminatorEvent event) {}
    @Override public void onUserUpdateAvatar(@Nonnull UserUpdateAvatarEvent event) {}
    @Override public void onUserUpdateOnlineStatus(@Nonnull UserUpdateOnlineStatusEvent event) {}
    @Override public void onUserUpdateActivityOrder(@Nonnull UserUpdateActivityOrderEvent event) {}
    @Override public void onUserUpdateFlags(@Nonnull UserUpdateFlagsEvent event) {}
    @Override public void onUserTyping(@Nonnull UserTypingEvent event) {}
    @Override public void onUserActivityStart(@Nonnull UserActivityStartEvent event) {}
    @Override public void onUserActivityEnd(@Nonnull UserActivityEndEvent event) {}
    @Override public void onUserUpdateActivities(@Nonnull UserUpdateActivitiesEvent event) {}
}
