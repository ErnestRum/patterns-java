package com.rum.patterns.strategy;

public class Main {

    private void runMain() {
        Order order = new Order();

        order.setPayStrategy(new PayByWebMoney());
        order.processOrder();
        order.setPayStrategy(new PayByCreditCard());
        order.processOrder();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
