package com.example.zomato.mapper;

import com.example.zomato.entity.Restaurant;
import com.example.zomato.requestdto.RestaurantRequest;
import com.example.zomato.responsedto.RestaurantResponse;
import org.springframework.stereotype.Component;

@Component
public class RestaurantMapper {

    public Restaurant mapToRestaurant(RestaurantRequest request){
        Restaurant restaurant=new Restaurant();
        restaurant.setName(request.getName());
        restaurant.setEmail(request.getEmail());
        restaurant.setPhoneNumber(request.getPhoneNumber());
        restaurant.setDietType(request.getTypes());
        restaurant.setDescription(request.getDescription());
        restaurant.setDietType(request.getTypes());
        return restaurant;
    }
    public RestaurantResponse mapToRestaurantResponse(Restaurant restaurant){
        RestaurantResponse response=new RestaurantResponse();
        response.setRestaurantId(restaurant.getRestaurantId());
        response.setName(restaurant.getName());
        response.setEmail(restaurant.getEmail());
        response.setDescription(restaurant.getDescription());
        response.setPhoneNumber(restaurant.getPhoneNumber());
        response.setDietType(restaurant.getDietType());
        return response;
    }
}
