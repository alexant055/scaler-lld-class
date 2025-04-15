package com.scaler.classes.oops4.interface1.ps;

public class UPI implements PaymentMethod{

    String upiId;

    public UPI(String id) {
        this.upiId = id;
    }

    @Override
    public void pay() {
        System.out.println("UPI paying....");
    }

}
