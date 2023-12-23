package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Learnset;
import com.xephir64.megatenapi.repository.LearnsetRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class LearnsetService {
    private LearnsetRepository learnsetRepository;

    @Autowired
    public void setLearnsetRepository(LearnsetRepository learnsetRepository) {
        this.learnsetRepository = learnsetRepository;
    }
    /**
     * Get the learnset of a demon
     * @param demonId The id of the demon
     * @return The learnset of the demon
     */
    public Iterable<Learnset> getLearnsetByDemonId(final int demonId) {
        ArrayList<Learnset> learnsetArray = new ArrayList<>();
        learnsetRepository.findAll().forEach((learnset -> {
            if (learnset.getDemonId() == demonId) {
                learnsetArray.add(learnset);
            }
        }));
        return learnsetArray;
    }
}
