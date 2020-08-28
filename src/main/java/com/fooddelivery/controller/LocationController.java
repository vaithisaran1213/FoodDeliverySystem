package com.fooddelivery.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.Location;
import com.fooddelivery.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/location/")
public class LocationController {

    @Autowired
    LocationService locationService;
    @RequestMapping(method = RequestMethod.GET,value="locations")
    public List<Location> getAllLocation(){
        return locationService.getAllLocation();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody String locationString) throws JsonProcessingException {
        locationService.addLocation(locationString);
    }
}
