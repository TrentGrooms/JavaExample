package com.example.demo.repository;

import com.example.demo.model.SuperHero;
import org.springframework.data.repository.CrudRepository;

public interface SuperHeroRepository extends CrudRepository<SuperHero, Integer>{

}
