package com.scaler.classes.oops4.interface1.ps;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    Map<String, PaymentMethod> payments;

    public PaymentService() {
        payments = new HashMap<>();
    }

    public void addPaymentMethod(String key, PaymentMethod pm) {
        payments.putIfAbsent(key, pm);
    }

    public PaymentMethod getPaymentMethod(String key) {
        return payments.get(key);
    }

    void makePayment(PaymentMethod pm) {
        pm.pay();
    }
}
