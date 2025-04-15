package com.scaler.classes.oops4.interface1.ps;

public class DebitCard extends Card implements PaymentMethod{
    private String bankAccountNumber;

    public DebitCard(String cardNo, String holderName, String bankAccountNumber) {
        super(cardNo, holderName);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void pay() {
        System.out.println("Debit Card paying....");
    }
}
