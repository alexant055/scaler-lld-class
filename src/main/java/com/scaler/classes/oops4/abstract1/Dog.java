package com.scaler.classes.oops4.abstract1;

public class Dog extends Animal implements Trainable{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }

    @Override
    public void search() {
        System.out.println("Dog is searching...");
    }
}
