package com.example.SuperHeroAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Entity
@Data
public class SuperHero {

    @Id
    @GeneratedValue
    private Integer id;


    @Range(min = 1, max = 10, message = "Strength must be 1 through 10")
    private int strengthLevel;

    @NotBlank
    private String name;


    private String superPower;



}
