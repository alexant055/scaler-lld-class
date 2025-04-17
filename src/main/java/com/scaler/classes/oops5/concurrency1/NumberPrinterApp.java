package com.scaler.classes.oops5.concurrency1;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinterApp {
    public static void main(String[] args) {
        // Print number from 1 to 100
        // Print each number using a separate thread
        // Each thread should know what number to print

        List<Thread> threads = new ArrayList<>();

        // Create lis of threads
        for (int i = 1; i <= 100; i++) {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }

        // Launch
        for (Thread t : threads) {
            t.start();
        }
    }
}
