package com.rum.patterns.builder;

public class Main {

    private void runMain() {
        User user1 = new User.UserBuilder("firstName1", "lastName1").age(50).phone("12345").address("address1").build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("firstName2", "lastName2").address("address2").build();
        System.out.println(user2);
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
