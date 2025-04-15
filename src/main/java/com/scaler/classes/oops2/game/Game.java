package com.scaler.classes.oops2.game;

public class Game {
    private int gameGuess;
    Player p1, p2, p3;

    public Game(String n1, String n2, String n3) {
        p1 = new Player(n1);
        p2 = new Player(n2);
        p3 = new Player(n3);
    }

    private void updateGuess() {
        this.gameGuess = (int) (Math.random() * 9) + 1;
        System.out.println("\nGame guessed: " + gameGuess);
    }

    boolean isWinner() {
        boolean anyWinner = false;
        if (p1.getGuess() == gameGuess) {
            System.out.println(p1.name + " wins");
            anyWinner = true;
        }
        if (p3.getGuess() == gameGuess) {
            System.out.println(p3.name + " wins");
            anyWinner = true;
        }
        if (p2.getGuess() == gameGuess) {
            System.out.println(p2.name + " wins");
            anyWinner = true;
        }
        return anyWinner;
    }

    public void start() {

        while (true) {
            updateGuess();
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            if (isWinner())
                break;
        }
    }

}
