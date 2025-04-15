package com.scaler.classes.oops4.abstract1;

public class Cat extends Animal implements Trainable {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void search() {
        System.out.println("Cat is searching...");
    }

}
