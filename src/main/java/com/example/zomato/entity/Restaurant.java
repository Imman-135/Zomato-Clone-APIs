package com.example.zomato.entity;

import com.example.zomato.config.GeneratedCustomId;
import com.example.zomato.enums.DietType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedCustomId
    private String restaurantId;

    private String name;

    private String description;

    private String phoneNumber;

    private String email;

    private List<DietType> dietType;


}
