package com.scaler.classes.oops4.abstract1;

public class MainDemo {

    public static void main(String[] args) {
        Animal c = new Cat("Jojo", 4);
        Animal d = new Dog("johny", 6);

        c.makeSound();
        c.eat();

        d.makeSound();
        d.eat();

    }
}
