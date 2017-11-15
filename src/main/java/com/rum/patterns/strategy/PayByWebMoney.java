package com.rum.patterns.strategy;

import com.rum.patterns.decorator.DataSource;

import java.util.HashMap;
import java.util.Map;

public class PayByWebMoney implements PayStrategy {

    private Map<String, String> DATA_BASE;
    private String email;
    private String password;
    private boolean signedIn;

    public PayByWebMoney() {
        DATA_BASE = new HashMap<>();
        DATA_BASE.put("user1", "user1@example.com");
        DATA_BASE.put("user2", "user2@example.com");
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using WebMoney");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        password = "user1";
        email = "user1@example.com";
        if (verify()) {
            System.out.println("Data verification success.");
        } else {
            System.out.println("Wrong email or password.");
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
