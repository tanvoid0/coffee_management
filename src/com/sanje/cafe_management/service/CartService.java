package com.sanje.cafe_management.service;

import com.sanje.cafe_management.data.FoodItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CartService {
    private static final List<FoodItem> items = new ArrayList<>();

    public double getTotal() {
        return items.stream().mapToDouble(FoodItem::getTotalPrice).sum();
    }

    public void addToCart(final FoodItem foodItem) {
        final Optional<FoodItem> existingItem = items.stream().filter(item -> item.getTitle().equals(foodItem.getTitle())).findFirst();
        if (existingItem.isPresent()) {
            existingItem.get().setQuantity(existingItem.get().getQuantity()+1);
        } else {
            items.add(foodItem);
        }
        for (final FoodItem item: items) {
            System.out.println(item.getTitle());
            System.out.println(item.getQuantity() + " * " + item.getPrice() + " = " + item.getTotalPrice());
        }
        System.out.println(getTotal());
    }

    public List<FoodItem> getItems() {
        return items;
    }

    public void pay() {
        // TODO: Add Payment functionalities in the future
        items.clear();
    }
}
