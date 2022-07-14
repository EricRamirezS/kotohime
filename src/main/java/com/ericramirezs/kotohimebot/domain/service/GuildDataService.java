package com.ericramirezs.kotohimebot.domain.service;

import com.ericramirezs.commando4j.CommandEngine;
import com.ericramirezs.commando4j.data.IRepository;
import com.ericramirezs.kotohimebot.persistance.GuildDataRepository;
import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuildDataService implements IRepository {

    private final GuildDataRepository repository;

    public GuildDataService(GuildDataRepository repository) {
        this.repository = repository;
    }

    public List<GuildDataEntity> getAll() {
        return repository.getAll();
    }

    public Optional<GuildDataEntity> getGuildData(String id) {
        return repository.getGuildData(id);
    }

    public GuildDataEntity save(GuildDataEntity data) {
        return repository.save(data);
    }

    public boolean delete(String id) {
        return getGuildData(id).map(data -> {
            repository.delete(id);
            return true;
        }).orElse(false);
    }

    @Override
    public String getPrefix(String id) {
        return getGuildData(id).map(GuildDataEntity::getPrefix).orElse(CommandEngine.getInstance().getPrefix());
    }

    @Override
    public String setPrefix(String id, String prefix) {
        Optional<GuildDataEntity> data = getGuildData(id);
        GuildDataEntity d;
        d = data.orElseGet(GuildDataEntity::new);
        d.setId(id);
        d.setPrefix(prefix);
        save(d);
        return d.getPrefix();
    }

    @Override
    public String getLanguage(String id) {
        return getGuildData(id).map(GuildDataEntity::getLanguage).orElse(CommandEngine.getInstance().getLanguage().toLanguageTag());
    }

    @Override
    public String setLanguage(String id, String language) {
        Optional<GuildDataEntity> data = getGuildData(id);
        GuildDataEntity d;
        d = data.orElseGet(GuildDataEntity::new);
        d.setId(id);
        d.setLanguage(language);
        save(d);
        return d.getLanguage();
    }
}
