package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Affinities;
import com.xephir64.megatenapi.service.AffinitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/affinities")
public class AffinitiesController {
    private AffinitiesService affinitiesService;
    
    @Autowired
    public void setAffinitiesService(AffinitiesService affinitiesService) {
        this.affinitiesService = affinitiesService;
    }

    @GetMapping("{demonID}")
    public Iterable<Affinities> getAffinities(@PathVariable int demonID) {
        return this.affinitiesService.getAffinitiesByDemonId(demonID);
    }
}
