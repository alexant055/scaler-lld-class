package com.scaler.classes.oops4.interface1.ps;

public class Main {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        DebitCard dc = new DebitCard("123456789", "Alexander", "745343");

        UPI upi = new UPI("alex-cc@ibl");

        ps.addPaymentMethod("dc1", dc);
        ps.addPaymentMethod("upi", upi);

        ps.makePayment(dc);
        ps.makePayment(upi);

        ps.makePayment(ps.getPaymentMethod("dc1"));
        ps.makePayment(ps.getPaymentMethod("upi"));
    }
}
