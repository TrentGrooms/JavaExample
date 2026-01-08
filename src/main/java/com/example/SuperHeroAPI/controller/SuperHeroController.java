package com.example.SuperHeroAPI.controller;

import com.example.SuperHeroAPI.model.SuperHero;
import com.example.SuperHeroAPI.repository.SuperHeroRepository;
import com.example.SuperHeroAPI.service.SuperHeroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SuperHeroController {

    @Autowired
    private SuperHeroService superHeroService;

    @GetMapping
    public Iterable<SuperHero> getSuperHero(){

        return superHeroService.getAllSuperHeros();
    }

    @PostMapping("/add")
    public SuperHero postSuperHero(@Valid @RequestBody SuperHero superHero){
        return superHeroService.createSuperHero(superHero);
    }

    @GetMapping("/name/{name}")
    public Iterable<SuperHero> getSuperHeroByName(@PathVariable String name){
        return superHeroService.getSuperHeroByName(name);
    }


}
