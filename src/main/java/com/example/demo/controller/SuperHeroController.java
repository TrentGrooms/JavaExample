package com.example.demo.controller;

import com.example.demo.model.SuperHero;
import com.example.demo.repository.SuperHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuperHeroController {

    @Autowired
    SuperHeroRepository superHeroRepository;

    @GetMapping
    public Iterable<SuperHero> getSuperHero(){
        return superHeroRepository.findAll();
    }
}
