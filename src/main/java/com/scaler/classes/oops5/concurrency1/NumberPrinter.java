package com.scaler.classes.oops5.concurrency1;

public class NumberPrinter implements Runnable {
    int data;

    public NumberPrinter(int number) {
        this.data = number;
    }

    @Override
    public void run() {
        System.out.println("Number: " + this.data + " on thread name:"+ Thread.currentThread().getName());
    }

}
