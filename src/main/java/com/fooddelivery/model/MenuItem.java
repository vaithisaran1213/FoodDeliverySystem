package com.fooddelivery.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class MenuItem {
    @Id
    @GeneratedValue
    Integer menuItemId;
    String menuItemName;

    float menuItemprice;

    @ManyToOne
    @JoinColumn(name="restaurant_id")
    Restaurant restaurant;

    public MenuItem() {
    }


    public Integer getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }



    public float getMenuItemprice() {
        return menuItemprice;
    }

    public void setMenuItemprice(float menuItemprice) {
        this.menuItemprice = menuItemprice;
    }
}
