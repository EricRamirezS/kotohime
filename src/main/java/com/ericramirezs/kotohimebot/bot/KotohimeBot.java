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
