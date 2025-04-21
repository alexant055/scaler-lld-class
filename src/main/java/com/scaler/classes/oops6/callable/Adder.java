package com.scaler.classes.oops6.callable;

import java.util.concurrent.Callable;

public class Adder implements Callable<Integer>{

    int a, b;

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        return this.a + this.b;
    }

}
