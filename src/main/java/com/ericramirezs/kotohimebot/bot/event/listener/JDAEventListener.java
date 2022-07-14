package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class JDAEventListener extends ListenerAdapter {

    @Override public void onReady(@Nonnull ReadyEvent event) {}
    @Override public void onResumed(@Nonnull ResumedEvent event) {}
    @Override public void onReconnected(@Nonnull ReconnectedEvent event) {}
    @Override public void onDisconnect(@Nonnull DisconnectEvent event) {}
    @Override public void onShutdown(@Nonnull ShutdownEvent event) {}
    @Override public void onStatusChange(@Nonnull StatusChangeEvent event) {}
    @Override public void onException(@Nonnull ExceptionEvent event) {}

}
