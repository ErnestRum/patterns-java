package com.rum.patterns.chain.authorization;

public class RoleCheckChain extends BaseChain {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("You logged as Admin.");
            return checkNext(email, password);
        } else {
            System.out.println("You logged as User.");
            return checkNext(email, password);
        }
    }

}
