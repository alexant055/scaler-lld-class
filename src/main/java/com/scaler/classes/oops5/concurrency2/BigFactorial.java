package com.scaler.classes.oops5.concurrency2;

import java.math.BigInteger;

public class BigFactorial implements Runnable {

    int number;

    public BigFactorial(int number) {
        this.number = number;
    }

    public void compute(int number) {
        BigInteger result = new BigInteger("1");
        for(int i=1; i<=number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

    @Override
    public void run() {
        compute(number);
    }

}
