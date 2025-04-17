package com.scaler.classes.oops5;

public class SyncPhotos implements Runnable{

    @Override
    public void run() {
        System.out.println("Syncing photos to cloud" + Thread.currentThread().getName());
    }

}
