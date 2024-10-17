package com.example.zomato.service;


import com.example.zomato.entity.Restaurant;
import com.example.zomato.mapper.RestaurantMapper;
import com.example.zomato.repository.RestaurantRepository;
import com.example.zomato.requestdtos.RestaurantRequest;
import com.example.zomato.responsedtos.RestaurantResponse;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final RestaurantMapper mapper;
    private final RestaurantRepository repository;
    RestaurantService(RestaurantMapper mapper, RestaurantRepository repository){
        this.mapper=mapper;
        this.repository=repository;
    }
    public RestaurantResponse addRestaurant(RestaurantRequest request){
        Restaurant restaurant=mapper.mapToRestaurant(request);
        repository.save(restaurant);
        return mapper.mapToRestaurantResponse(restaurant);
    }


}
