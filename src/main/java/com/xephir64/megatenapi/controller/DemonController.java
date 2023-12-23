package com.xephir64.megatenapi.controller;

import com.xephir64.megatenapi.model.Demon;
import com.xephir64.megatenapi.service.DemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demons")
public class DemonController {
    private DemonService demonService;

    @Autowired
    public void setDemonService(DemonService demonService) {
        this.demonService = demonService;
    }

    @GetMapping("/all")
    public Iterable<Demon> getDemons() {
        return demonService.getAllDemons();
    }

    @GetMapping("{name}")
    public Demon getDemon(@PathVariable String name) {
        return demonService.getDemon(name);
    }

    @GetMapping("/contains/{contains}")
    public Iterable<Demon> getDemonsByLetter(@PathVariable String contains) {
        return demonService.getDemonsByLetter(contains);
    }
}
