package com.fooddelivery.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.Restaurant;
import com.fooddelivery.repository.RestaurantRepository;
import com.fooddelivery.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepository.findAll();
    }

    public List<Restaurant> getRestaurantByLocation(String locationName) {
        return restaurantRepository.findRestaurantByLocation(locationName);
    }


    public void create(String strRestaurant) throws JsonProcessingException {
        restaurantRepository.save((Restaurant) Converter.stringToObject(strRestaurant,Restaurant.class));
    }
}
