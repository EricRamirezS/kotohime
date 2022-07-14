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
