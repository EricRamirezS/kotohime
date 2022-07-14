package com.ericramirezs.kotohimebot.bot;

import com.ericramirezs.commando4j.CommandEngine;
import com.ericramirezs.kotohimebot.bot.customization.Engine;
import com.ericramirezs.kotohimebot.bot.event.EventListenerSetter;
import com.ericramirezs.kotohimebot.domain.service.GuildDataService;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class KotohimeBot {

    @Value("${bot.token}")
    private String token;

    private final Engine engine;

    private final GuildDataService repository;

    public KotohimeBot(Engine engine, GuildDataService repository) {
        this.engine = engine;
        this.repository = repository;
    }

    private static void addCommandPackages() {
        CommandEngine.includeBuildInUtils(); // Include Command in the engine
        CommandEngine.addCommandPackage("com.ericramirezs.kotohimebot.bot.command"); // Command Classpath package
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run()  {
        try {
            CommandEngine.setInstance(engine);
            CommandEngine.setRepository(repository);
            addCommandPackages();
            JDABuilder jdab = JDABuilder.createLight(token);
            EventListenerSetter.setListeners(jdab);
            CommandEngine.create(jdab);
        } catch (Exception ex){
            CommandEngine.getInstance().logError(Arrays.toString(ex.getStackTrace()));
        }
    }
}
