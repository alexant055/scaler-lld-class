package com.scaler.classes.oops6.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.scaler.classes.oops5.ImageProcess;
import com.scaler.classes.oops5.concurrency1.NumberPrinter;
import com.scaler.classes.oops5.concurrency2.BigFactorial;

public class ExecutorFrameworkDemo {

    public static void main(String[] args) {
        // creating thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(new ImageProcess());
        executorService.submit(new BigFactorial(5));
        executorService.submit(new NumberPrinter(500));

        for (int i = 0; i < 100; i++) {
            executorService.submit(new NumberPrinter(1));
        }

        // wait till tasks are to finished (safe to use, gracefully shutdown)
        executorService.shutdown();
    }

}
