package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Resistances;
import com.xephir64.megatenapi.repository.ResistancesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class ResistancesService {
    private ResistancesRepository resistancesRepository;

    @Autowired
    public void setResistancesRepository(ResistancesRepository resistancesRepository) {
        this.resistancesRepository = resistancesRepository;
    }
    /**
     * Get the resistances of a demon
     * @param demonId The id of the demon
     * @return The resistances of the demon
     */
    public Iterable<Resistances> getResistancesByDemonId(final int demonId) {
        ArrayList<Resistances> resistancesArray = new ArrayList<>();
        this.resistancesRepository.findAll().forEach(resistances -> {
            if (resistances.getDemonId() == demonId) {
                resistancesArray.add(resistances);
            }
        });
        return  resistancesArray;
    }
}
