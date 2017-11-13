package com.rum.patterns.chain.authorization;

import com.rum.patterns.chain.server.Server;

public class UserExistsChain extends BaseChain {

    @Override
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email)) {
            System.out.println("User not found.");
            return false;
        }

        return checkNext(email, password);
    }

}
