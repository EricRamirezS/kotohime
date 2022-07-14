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
