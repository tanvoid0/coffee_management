package com.sanje.cafe_management.service;

import com.sanje.cafe_management.data.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private static final List<FoodItem> items = new ArrayList<>();

    public double getTotal() {
        return items.stream().mapToDouble(FoodItem::getPrice).sum();
    }

    public void addToCart(final FoodItem item) {
        items.add(item);
        System.out.println(getTotal());
    }

    public static List<FoodItem> getItems() {
        return items;
    }
}
