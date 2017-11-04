package com.rum.patterns.builder;

public class Main {

    private User user;

    private void runMain() {
        user = new User.UserBuilder("firstName1", "lastName2").phone("12345").address("address1").build();
        System.out.println(user);
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
