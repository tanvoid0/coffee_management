package com.sanje.cafe_management;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class AuthService {
    private static User authUser;

    public User login(final String email, final String password) throws Exception {
        List<User> userList = DummyData.users;
        final Optional<User> user = userList.stream().filter(item -> Objects.equals(item.getEmail(), email)).findFirst();


        if (user.isEmpty()) {
            throw new Exception("User with email not found.");
        }
        if (!Objects.equals(user.get().getPassword(), password)) {
            throw new Exception("Invalid credentials provided.");
        }
        authUser = user.get();
        return authUser;
    }

    public User register(final User user) throws Exception {
        if (user.getRole().equals(UserRole.ADMIN) && null != authUser && !authUser.getRole().equals(UserRole.ADMIN)) {
            throw new Exception("Current user does not have permission to register an ADMIN");
        }
        if (user.getRole().equals(UserRole.STAFF) && null != authUser && !Set.of(UserRole.ADMIN, UserRole.STAFF).contains(authUser.getRole())) {
            throw new Exception("Current user does not have permission to register a STAFF");
        }
        // TODO: do further validation on properties of user, here

        // add the new user to our global list. Which will be replaced by database insertion later
        DummyData.users.addLast(user);
        return user;
    }

    public void logout() {
        authUser = null;
    }
}
