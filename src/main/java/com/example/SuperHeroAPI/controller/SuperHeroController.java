package com.example.SuperHeroAPI.controller;

import com.example.SuperHeroAPI.model.SuperHero;
import com.example.SuperHeroAPI.repository.SuperHeroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperHeroController {

    @Autowired
    SuperHeroRepository superHeroRepository;

    @GetMapping
    public Iterable<SuperHero> getSuperHero(){
        return superHeroRepository.findAll();
    }

    @PostMapping("/add")
    public void addSuperHero(@Valid @RequestBody SuperHero superHero){
        superHeroRepository.save(superHero);
    }

}
