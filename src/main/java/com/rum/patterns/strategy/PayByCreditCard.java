package com.rum.patterns.strategy;

public class PayByCreditCard implements PayStrategy {

    private CreditCard creditCard;
    private boolean validCard;

    @Override
    public boolean pay(int paymentAmount) {
        if (validCard) {
            System.out.println("Paying " + paymentAmount + " using Credit Card");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        creditCard = new CreditCard("creditCardNumber", "creditCardDate", "creditCardCVV");
        creditCard.setAmount(1000);
        if (verifyCreditCard()) {
            System.out.println("Credit Card verified.");
        } else {
            System.out.println("Credit Card not verified.");
        }
    }

    private boolean verifyCreditCard() {
        if (creditCard != null) {
            validCard = true;
        } else {
            validCard = false;
        }
        return validCard;
    }

}
