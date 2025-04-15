package com.scaler.classes.oops3;

public class Car {
    static int count;
    String name;

    public Car(String name) {
        this.name = name;
        count++;
    }

    static int getCount() {
        return count;
    }
}
