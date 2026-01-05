package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class SuperHero {

    @Id
    @GeneratedValue
    private Integer id;


    private int strengthLevel;

    @NotNull
    private String name;

    private String superPower;



}
