package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Affinities;
import com.xephir64.megatenapi.repository.AffinitiesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class AffinitiesService {
    private AffinitiesRepository affinitiesRepository;

    @Autowired
    public void setAffinitiesRepository(AffinitiesRepository affinitiesRepository) {
        this.affinitiesRepository = affinitiesRepository;
    }
    /**
     * Get the affinities of a demon
     * @param demonId The id of the demon
     * @return The affinities of the demon
     */
    public Iterable<Affinities> getAffinitiesByDemonId(final int demonId) {
        ArrayList<Affinities> demonAffinities = new ArrayList<>();
        affinitiesRepository.findAll().forEach(affinities1 -> {
            if (affinities1.getDemonId() == demonId) {
                demonAffinities.add(affinities1);
            }
        });
        return demonAffinities;
    }

    public void deleteAffinities(final Long id) {
        affinitiesRepository.deleteById(id);
    }

    public Affinities saveAffinities(Affinities affinities) {
        return affinitiesRepository.save(affinities);
    }
}
