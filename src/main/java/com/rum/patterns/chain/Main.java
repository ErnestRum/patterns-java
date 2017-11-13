package com.rum.patterns.chain;

import com.rum.patterns.chain.authorization.BandwidthChain;
import com.rum.patterns.chain.authorization.BaseChain;
import com.rum.patterns.chain.authorization.RoleCheckChain;
import com.rum.patterns.chain.authorization.UserExistsChain;
import com.rum.patterns.chain.server.Server;

public class Main {

    private Server server;

    private void init() {
        server = new Server();
        server.register("admin@example.com", "1111");
        server.register("user1@example.com", "2222");
        server.register("user2@example.com", "3333");

        BaseChain authorizationChain = new BandwidthChain(5);
        authorizationChain.linkWith(new UserExistsChain()).linkWith(new RoleCheckChain());

        server.setAuthorizationChain(authorizationChain);
    }

    private void runMain() {
        init();

        server.logIn("admin@example.com", "1111");
        server.logIn("user1@example.com", "2222");
        server.logIn("user5@example.com", "2222");
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
