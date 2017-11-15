package com.rum.patterns.templatemethod;

public class Basketball extends Game {

    @Override
    void initialize() {
        System.out.println("Basketball Game initialize.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game start.");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball Game end.");
    }

}
