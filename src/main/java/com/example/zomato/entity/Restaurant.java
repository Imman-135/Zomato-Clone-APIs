package com.example.zomato.entity;

import com.example.zomato.config.GeneratedCustomId;
import com.example.zomato.enums.DietType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "restaurants")
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedCustomId
    @Column(name = "restaurant_id")
    private String restaurantId;

    @Column(name = "restaurant_name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "diet_types")
    @ElementCollection
    private List<DietType> dietType;


}
