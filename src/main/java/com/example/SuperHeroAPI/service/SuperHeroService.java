package com.example.SuperHeroAPI.service;

import com.example.SuperHeroAPI.model.SuperHero;
import com.example.SuperHeroAPI.repository.SuperHeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperHeroService {

    @Autowired
    private SuperHeroRepository superHeroRepository;

    public Iterable<SuperHero> getAllSuperHeros() {
        // do business logic here
        return superHeroRepository.findAll();
    }

    public SuperHero createSuperHero(SuperHero superHero) {
        return superHeroRepository.save(superHero);

    }

    public Iterable<SuperHero> getSuperHeroByName(String name) {
        return superHeroRepository.findSuperHeroesByName(name);
    }
}
