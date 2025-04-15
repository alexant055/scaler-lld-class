package com.scaler.classes.oops3;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Honda");
        Car c2 = new Car("Honda");
        Car c3 = new Car("Honda");

        System.out.println("Car count: " + Car.getCount());
    }
}
