package com.scaler.classes.oops4.interface1.vehile;

public interface Vehicle {

    int MAX_SPEED = 120;
    static String VEHICLE_COUNTRY = "India";

    void start();

    default void stop() {
        System.out.println("Vehicle has stopped...");
    }

    static void sell() {
        System.out.println("Vehicle got sold...");
    }
}
