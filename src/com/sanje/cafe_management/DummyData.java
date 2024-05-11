package com.sanje.cafe_management;

import java.util.List;

public class DummyData {
    public static final User admin = new User(1, "admin", "admin@mail.com", "admin", UserRole.ADMIN);
    public static final User staff = new User(2, "Mamun", "staff@mail.com", "staff", UserRole.STAFF);
    public static final User customer = new User(3, "Piash", "customer@mail.com", "customer", UserRole.CUSTOMER);

    public static final List<User> users = List.of(admin, staff, customer);


}
