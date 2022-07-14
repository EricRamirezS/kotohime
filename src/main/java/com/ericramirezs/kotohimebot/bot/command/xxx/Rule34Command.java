/*
 * Copyright (C) 2022  Eric Bastian Ramírez Santis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ericramirezs.kotohimebot.bot.command.xxx;

import com.ericramirezs.commando4j.CommandEngine;
import com.ericramirezs.commando4j.Slash;
import com.ericramirezs.commando4j.arguments.IArgument;
import com.ericramirezs.commando4j.arguments.StringArgument;
import com.ericramirezs.commando4j.command.Command;
import com.ericramirezs.commando4j.exceptions.DuplicatedArgumentNameException;
import com.ericramirezs.kotohimebot.bot.customization.Engine;
import com.ericramirezs.kotohimebot.external.api.rule34.Rule34Service;
import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Map;


public class Rule34Command extends Command implements Slash {

    public Rule34Command() throws DuplicatedArgumentNameException {
        super("rule34", "xxx", "Buscaré una imagen R-18 con los tags indicados",
                new StringArgument("tag", "Coloque los tags que desea buscar.")
                        .setDefaultValue(""));
        isNsfw();
        addClientPermissions(Permission.MESSAGE_SEND, Permission.MESSAGE_EMBED_LINKS, Permission.MESSAGE_ATTACH_FILES);
        addExamples("~rule34 touhou",
                "~rule34 touhou alice_margatroid");
    }

    @Override
    protected String hasPermission(@NotNull MessageReceivedEvent event) {
        if (!event.isFromGuild()) return null;

        GuildDataEntity data = ((Engine) CommandEngine.getInstance()).getGuildData(event);
        if (data == null) return null;
        if (!data.getNsfw())
            return "Este servidor no permite el uso de comandos marcados como NSFW.";
        if (!Arrays.asList(data.getAllowedCategoriesList()).contains(getGroup()))
            return "Los comandos de esta categoría no están habilitados en este servidor.";
        return null;
    }

    @Override
    public void run(@NotNull MessageReceivedEvent event, @NotNull Map<String, IArgument> args) {
        String tags = args.get("tag").getValue().toString();
        try {
            String img = Rule34Service.getInstance().getImageLink(tags.split(" "));
            sendReply(event, img);
        } catch (Exception ex) {
            sendReply(event, ex.getMessage());
        }
    }

    @Override
    public void run(@NotNull SlashCommandInteractionEvent slashCommandInteractionEvent, @UnmodifiableView @NotNull Map<String, IArgument> map) {

    }
}
