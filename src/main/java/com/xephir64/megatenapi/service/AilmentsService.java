package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Ailments;
import com.xephir64.megatenapi.repository.AilmentsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class AilmentsService {
    private AilmentsRepository ailmentsRepository;

    @Autowired
    public void setAilmentsRepository(AilmentsRepository ailmentsRepository) {
        this.ailmentsRepository = ailmentsRepository;
    }
    /**
     * Get the ailments of a demon
     * @param demonId The id of the demon
     * @return The ailments of the demon
     */
    public Iterable<Ailments> getAilmentsByDemonId(final int demonId) {
        ArrayList<Ailments> ailmentsArray = new ArrayList<>();
        ailmentsRepository.findAll().forEach((ailments -> {
            if (ailments.getDemonId() == demonId) {
                ailmentsArray.add(ailments);
            }
        }));
        return ailmentsArray;
    }
}
