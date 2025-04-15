package com.scaler.classes.oops4.interface1.ps;

public class PaytmWallet implements PaymentMethod{

    String phoneNumber;

    public PaytmWallet(String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay() {
        System.out.println("Paytm wallet paying....");
    }

}
