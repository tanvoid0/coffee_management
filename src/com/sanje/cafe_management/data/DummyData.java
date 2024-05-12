package com.sanje.cafe_management.data;

import java.util.List;

public class DummyData {
    public static final User admin;
    public static final User staff;
    public static final User customer;
    public static final List<User> users;
    public static final List<FoodItem> drinks;
    public static final List<FoodItem> coffees;

    public DummyData() {
    }

    static {
        admin = new User(1, "admin", "admin@mail.com", "admin", UserRole.ADMIN);
        staff = new User(2, "Mamun", "staff@mail.com", "staff", UserRole.STAFF);
        customer = new User(3, "Piash", "customer@mail.com", "customer", UserRole.CUSTOMER);
        users = List.of(admin, staff, customer);
        drinks = List.of(new FoodItem("Oreo Shake", null, "/images/dr1.jpg", 240.0, FoodItemType.DRINK), new FoodItem("Strawberry Shake", (String)null, "/images/dr2.jpg", 220.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Lemon Mint", (String)null, "/images/dr3.jpg", 180.0, FoodItemType.DRINK), new FoodItem("Caramel Pretzel", (String)null, "/images/dr4.jpg", 230.0, FoodItemType.DRINK));
        coffees = List.of(new FoodItem("Cappuchino", null, "/images/Coffee1.jpeg", 400, FoodItemType.COFFEE), new FoodItem("Macchiato", null, "/images/Coffee2.jpeg", 350, FoodItemType.COFFEE), new FoodItem("Americano", null, "/images/Coffee3.jpeg", 280, FoodItemType.COFFEE));
    }
}
