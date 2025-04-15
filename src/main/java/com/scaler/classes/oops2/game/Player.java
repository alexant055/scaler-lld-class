package com.scaler.classes.oops2.game;

public class Player {

    String name;
    private int guess;

    public Player(String name) {
         this.name = name;
    }

    void makeGuess() {
        int number = (int)(Math.random()*9) + 1;
        System.out.println(name + " guessed number: " + number);
        this.guess = number;
    }

    public int getGuess() {
        return this.guess;
    }
}
