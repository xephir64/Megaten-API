package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Learnset;
import com.xephir64.megatenapi.service.LearnsetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learnset")
public class LearnsetController {
    private LearnsetService learnsetService;

    @Autowired
    public void setLearnsetService(LearnsetService learnsetService) {
        this.learnsetService = learnsetService;
    }

    @GetMapping("{demonId}")
    public Iterable<Learnset> getLearnset(@PathVariable int demonId) {
        return this.learnsetService.getLearnsetByDemonId(demonId);
    }
}
