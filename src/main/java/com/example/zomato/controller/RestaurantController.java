package com.example.zomato.controller;

import com.example.zomato.requestdtos.RestaurantRequest;
import com.example.zomato.responsedtos.RestaurantResponse;
import com.example.zomato.service.RestaurantService;
import com.example.zomato.util.AppResponseBuilder;
import com.example.zomato.util.ResponseStructure;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${zomato.base_url}")
public class RestaurantController {
    private final RestaurantService service;
    private final AppResponseBuilder builder;
    RestaurantController(RestaurantService service,AppResponseBuilder builder){
        this.service=service;
        this.builder=builder;
    }

    @PostMapping("/restaurants")
    public ResponseEntity<ResponseStructure<RestaurantResponse>> addRestaurant(@RequestBody @Valid RestaurantRequest restaurantRequest){
            RestaurantResponse response=service.addRestaurant(restaurantRequest);
            return builder.success(HttpStatus.CREATED,"Restaurant Has Been Added",response);
    }

}
