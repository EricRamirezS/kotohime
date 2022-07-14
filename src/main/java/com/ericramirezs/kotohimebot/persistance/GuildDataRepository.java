package com.ericramirezs.kotohimebot.persistance;

import com.ericramirezs.kotohimebot.persistance.crud.IGuildDataCrudRepository;
import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GuildDataRepository {

    private final IGuildDataCrudRepository crudRepository;

    public GuildDataRepository(IGuildDataCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<GuildDataEntity> getAll(){
        return (List<GuildDataEntity>) crudRepository.findAll();
    }

    public Optional<GuildDataEntity> getGuildData(String id){
        return crudRepository.findById(id);
    }

    public GuildDataEntity save(GuildDataEntity guildData){
        return crudRepository.save(guildData);
    }

    public void delete(String id){
        crudRepository.deleteById(id);
    }
}
