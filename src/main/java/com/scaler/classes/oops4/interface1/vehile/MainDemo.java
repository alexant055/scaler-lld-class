package com.scaler.classes.oops4.interface1.vehile;

public class MainDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.start();
        v.stop();

        System.out.println(Vehicle.MAX_SPEED);

        Vehicle.sell();
        System.out.println(Vehicle.VEHICLE_COUNTRY);
    }
}
