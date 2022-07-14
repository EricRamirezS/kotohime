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

package com.ericramirezs.kotohimebot.bot.command.anime;

import com.ericramirezs.commando4j.arguments.IArgument;
import com.ericramirezs.commando4j.command.Command;
import com.ericramirezs.commando4j.exceptions.DuplicatedArgumentNameException;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class SaucenaoCommand extends Command {


    public SaucenaoCommand() throws DuplicatedArgumentNameException {
        super("saucenao", "anime", "Dame una imagen y te diré su fuente.");
    }

    @Override
    public void run(@NotNull MessageReceivedEvent messageReceivedEvent, @NotNull Map<String, IArgument> map) {

    }
}
