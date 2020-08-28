package com.fooddelivery.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.Location;
import com.fooddelivery.repository.LocationRepository;
import com.fooddelivery.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public void addLocation(String location) throws JsonProcessingException {
        locationRepository.saveAndFlush((Location)Converter.stringToObject(location,Location.class));
    }


    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }
}
