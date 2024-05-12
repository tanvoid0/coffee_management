package com.sanje.cafe_management.data;

public class FoodItem {
    private String title;
    private String description;
    private String image;
    private double price;
    private int quantity;
    private FoodItemType type;

    public FoodItem(String title, String description, String image, double price, FoodItemType type) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public FoodItemType getType() {
        return this.type;
    }

    public void setType(FoodItemType type) {
        this.type = type;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
