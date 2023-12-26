package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Stats;
import com.xephir64.megatenapi.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/stats")
public class StatsController {
    private StatsService statsService;

    @Autowired
    public void setStatsService(StatsService statsService) {
        this.statsService = statsService;
    }

    @GetMapping("{demonId}")
    public Iterable<Stats> getStats(@PathVariable int demonId) {
        return this.statsService.getStatsByDemonId(demonId);
    }
}
