package com.xephir64.megatenapi.service;

import com.xephir64.megatenapi.model.Stats;
import com.xephir64.megatenapi.repository.StatsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class StatsService {
    private StatsRepository statsRepository;

    @Autowired
    public void setStatsRepository(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }
    /**
     * Get the stats of a demon
     * @param demonId The id of the demon
     * @return The stats of the demon
     */
    public Iterable<Stats> getStatsByDemonId(final int demonId) {
        ArrayList<Stats> statsArray = new ArrayList<>();
        this.statsRepository.findAll().forEach(stats -> {
            if (stats.getDemonId() == demonId) {
                statsArray.add(stats);
            }
        });
        return statsArray;
    }
}
