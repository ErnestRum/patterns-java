package com.rum.patterns.templatemethod;

public class Main {

    private Game game;

    private void runMain() {
        game = new Football();
        game.play();

        game = new Basketball();
        game.play();
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
