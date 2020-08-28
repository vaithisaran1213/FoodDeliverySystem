package com.fooddelivery.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.Restaurant;
import com.fooddelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant/")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    @RequestMapping(method = RequestMethod.GET,value="{locationName}")
    public List<Restaurant> getAllRestaurant(@PathVariable String locationName){
        return restaurantService.getRestaurantByLocation(locationName);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody String strRestaurant) throws JsonProcessingException {
        System.out.println(strRestaurant);
        restaurantService.create(strRestaurant);
    }

}
