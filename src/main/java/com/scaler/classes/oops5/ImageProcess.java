package com.scaler.classes.oops5;

public class ImageProcess implements Runnable {
    public void deniose() {
        System.out.println("Denoise the image: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Image is processing..." + Thread.currentThread().getName());
        deniose();
    }
}
