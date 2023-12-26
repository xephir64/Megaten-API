package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Resistances;
import com.xephir64.megatenapi.service.ResistancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/resistances")
public class ResistancesController {
    private ResistancesService resistancesService;

    @Autowired
    public void setResistancesService(ResistancesService resistancesService) {
        this.resistancesService = resistancesService;
    }

    @GetMapping("{demonId}")
    public Iterable<Resistances> getResistances(@PathVariable int demonId) {
        return this.resistancesService.getResistancesByDemonId(demonId);
    }
}
