package com.rum.patterns.templatemethod;

public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game initialize.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game start.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game end.");
    }

}
