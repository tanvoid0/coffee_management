package org.sanje.utils;

import org.sanje.entity.Product;
import org.sanje.entity.ProductType;
import org.sanje.entity.User;
import org.sanje.entity.UserRole;

import java.util.List;

public class DummyData {
    public static final User admin = new User(1, "admin", "admin@mail.com", "admin", UserRole.ADMIN);

    public static final Product coffee1 = new Product(1, "Cappuccino", "/images/products/cappuccino.png", "", 200, ProductType.COFFEE);
    public static final Product coffee2 = new Product(2, "Macchiato", "/images/products/macchiato.png", "", 220, ProductType.COFFEE);
    public static final Product pastry1 = new Product(3, "Baklava", "/images/products/baklava.png", "", 150, ProductType.PASTRY);
    public static final Product food1 = new Product(4, "Sandwich", "/images/products/sandwich.png", "", 260, ProductType.SIDES);

    public static final Product drink1 = new Product(5, "Coke", "/images/products/cappuccino.png", "", 50, ProductType.DRINK);

    public static final List<Product> coffees = List.of(coffee1, coffee2);
    public static final List<Product> drinks = List.of(drink1, drink1, drink1, drink1, drink1);
    public static final List<Product> pastries = List.of(pastry1);
    public static final List<Product> foods = List.of(food1);
}
