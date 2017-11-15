package com.rum.patterns.strategy;

public class Order {

    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void processOrder() {
        payStrategy.collectPaymentDetails();
        payStrategy.pay(20);
    }

}
