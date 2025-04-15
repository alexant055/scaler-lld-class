package com.scaler.classes.oops3.polymorphism;

public class Main {

    static void playWithAnimal(Animal a) {
        a.play();
    }

    static void playWithAnimal(Animal[] a) {
        for (Animal d : a) {
            d.play();
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        playWithAnimal(a);

        Animal c = new Cat();
        playWithAnimal(c);

        Animal[] animals = new Animal[2];
        animals[0] = a;
        animals[1] = c;
        playWithAnimal(animals);
    }
}
