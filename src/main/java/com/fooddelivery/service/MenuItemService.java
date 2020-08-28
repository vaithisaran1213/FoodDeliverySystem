package com.fooddelivery.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.MenuItem;
import com.fooddelivery.repository.MenuItemRepository;
import com.fooddelivery.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuItemService {

    @Autowired
    MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems(){
        return menuItemRepository.findAll();
    }

    public List<MenuItem> getAllMenuItemByRestaurant(String restaurantName){
        return this.getAllMenuItems().stream().filter(item->item.getRestaurant().equals(restaurantName)).collect(Collectors.toList());
    }

    public void create(String menuItemString) throws JsonProcessingException {
        menuItemRepository.save((MenuItem) Converter.stringToObject(menuItemString,MenuItem.class));
    }


}
