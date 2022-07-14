package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.stage.*;
import net.dv8tion.jda.api.events.stage.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildStageInstanceEventListener extends ListenerAdapter {

    @Override public void onStageInstanceDelete(@Nonnull StageInstanceDeleteEvent event) {}
    @Override public void onStageInstanceUpdateTopic(@Nonnull StageInstanceUpdateTopicEvent event) {}
    @Override public void onStageInstanceUpdatePrivacyLevel(@Nonnull StageInstanceUpdatePrivacyLevelEvent event) {}
    @Override public void onStageInstanceCreate(@Nonnull StageInstanceCreateEvent event) {}
}
