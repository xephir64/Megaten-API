package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Ailments;
import com.xephir64.megatenapi.service.AilmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ailments")
public class AilmentsController {
    private AilmentsService ailmentsService;

    @Autowired
    public void setAilmentsService(AilmentsService ailmentsService) {
        this.ailmentsService = ailmentsService;
    }

    @GetMapping("{demonId}")
    public Iterable<Ailments> getAilments(@PathVariable int demonId) {
        return this.ailmentsService.getAilmentsByDemonId(demonId);
    }
}
