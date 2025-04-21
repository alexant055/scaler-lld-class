package com.scaler.classes.oops6.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AdderDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> result = executorService.submit(new Adder(2,3)); // non-blocking call

        System.out.println("Main is doing the calculation...");

        System.out.println(result.get()); // blocking call, wait until result gets data.
        executorService.shutdown();
    }
}
