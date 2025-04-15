package com.scaler.classes.oops4.interface1.ps;

public class CreditCard extends Card implements PaymentMethod{

    private int maxLimit;

    public CreditCard(String cardNo, String holderName, int maxLimit) {
        super(cardNo, holderName);
        this.maxLimit = maxLimit;
    }

    @Override
    public void pay() {
        System.out.println("Credit Card paying....");
    }

}
