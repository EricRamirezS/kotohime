package com.ericramirezs.kotohimebot.persistance.crud;

import com.ericramirezs.kotohimebot.persistance.entities.GuildDataEntity;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IGuildDataCrudRepository extends CrudRepository<GuildDataEntity, String> {

    @NotNull Optional<GuildDataEntity> findById(@NotNull String id);
}
