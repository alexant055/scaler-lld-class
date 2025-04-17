package com.scaler.classes.oops5;

public class LightRoom {
    public static void main(String[] args) {
        System.out.println("Lightroom is running: " + Thread.currentThread().getName());

        // Thread creation
        Thread t1 = new Thread(new ImageProcess());
        Thread t2 = new Thread(new SyncPhotos());

        // Launch the thread
        t2.start();
        t1.start();

        // Process --> Application
        // Applications -> Many independent tasks (Threads)
    }
}
