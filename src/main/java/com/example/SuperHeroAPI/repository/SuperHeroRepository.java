package com.example.SuperHeroAPI.repository;

import com.example.SuperHeroAPI.model.SuperHero;
import org.springframework.data.repository.CrudRepository;

public interface SuperHeroRepository extends CrudRepository<SuperHero, Integer>{
    Iterable<SuperHero> findSuperHeroesByName(String superHero);
    Iterable<SuperHero> findSuperHeroesByStrengthLevelIsBetween(int strengthLevelMin, int strengthLevelMax);
}
