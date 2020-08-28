package com.fooddelivery.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fooddelivery.model.MenuItem;
import com.fooddelivery.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menuitem/")
public class MenuItemController {

    @Autowired
    MenuItemService menuItemService;

    @RequestMapping(method = RequestMethod.GET,value="menuitems")
    public List<MenuItem> getAllMenuItems(){
        return menuItemService.getAllMenuItems();
    }

    @RequestMapping(method = RequestMethod.GET,value="menuitems/{restaurant}")
    public List<MenuItem> getAllMenuItemsByRestaurant(@PathVariable String restaurant){
        return menuItemService.getAllMenuItemByRestaurant(restaurant);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody String menuItemString) throws JsonProcessingException {
        menuItemService.create(menuItemString);
    }
}
