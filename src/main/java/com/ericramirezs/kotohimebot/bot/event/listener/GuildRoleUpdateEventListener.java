package com.ericramirezs.kotohimebot.bot.event.listener;

import net.dv8tion.jda.api.events.role.update.*;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class GuildRoleUpdateEventListener extends ListenerAdapter {
    @Override public void onRoleUpdateColor(@Nonnull RoleUpdateColorEvent event) {}
    @Override public void onRoleUpdateHoisted(@Nonnull RoleUpdateHoistedEvent event) {}
    @Override public void onRoleUpdateIcon(@Nonnull RoleUpdateIconEvent event) {}
    @Override public void onRoleUpdateMentionable(@Nonnull RoleUpdateMentionableEvent event) {}
    @Override public void onRoleUpdateName(@Nonnull RoleUpdateNameEvent event) {}
    @Override public void onRoleUpdatePermissions(@Nonnull RoleUpdatePermissionsEvent event) {}
    @Override public void onRoleUpdatePosition(@Nonnull RoleUpdatePositionEvent event) {}
}
