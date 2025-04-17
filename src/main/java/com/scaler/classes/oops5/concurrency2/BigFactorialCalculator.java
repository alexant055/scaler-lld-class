package com.scaler.classes.oops5.concurrency2;

public class BigFactorialCalculator {

    public static void main(String[] args) {
        BigFactorial b = new BigFactorial(500);

        Thread t = new Thread(b);
        t.start();

        System.out.println("Main is doing work..");
    }
}
