package com.scaler.classes.oops6.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = new ArrayList<>(List.of(5,3,2,1,0,6));

        ExecutorService exectors = Executors.newWorkStealingPool();

        Future<List<Integer>> result = exectors.submit(new MergeSort(list, exectors));

        System.out.println(result.get());

        exectors.shutdown();
    }
}
