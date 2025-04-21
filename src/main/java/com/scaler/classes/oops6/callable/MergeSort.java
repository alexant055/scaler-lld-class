package com.scaler.classes.oops6.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> list;
    ExecutorService executors;

    public MergeSort(List<Integer> list, ExecutorService exectors) {
        this.list = list;
        this.executors = exectors;
    }

    @Override
    public List<Integer> call() throws Exception {
        // base case
        if (list.size() <= 1) {
            return list;
        }

        // split into two list
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int mid = this.list.size() / 2;

        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }

        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }

        // recursive with threads
        Future<List<Integer>> leftSortedFuture = executors.submit(new MergeSort(left, executors));
        Future<List<Integer>> rightSortedFuture = executors.submit(new MergeSort(right, executors));

        // merge
        // we wait for the output before doing a merge
        left = leftSortedFuture.get();
        right = rightSortedFuture.get();

        // merge list
        List<Integer> output = new ArrayList<>();

        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                output.add(left.get(i));
                i++;
            } else {
                output.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            output.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            output.add(right.get(j));
            j++;
        }

        return output;
    }

}
