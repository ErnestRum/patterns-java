package com.rum.patterns.chain.server;

import com.rum.patterns.chain.authorization.BaseChain;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private static Map<String, String> users = new HashMap<>();
    private BaseChain baseChain;

    public void setAuthorizationChain(BaseChain baseChain) {
        this.baseChain = baseChain;
    }

    public boolean logIn(String email, String password) {
        if (baseChain.check(email, password)) {
            System.out.println("Authorization have been successful.");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public static boolean hasEmail(String email) {
        return users.containsKey(email);
    }

}
