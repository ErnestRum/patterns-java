package com.rum.patterns.adapter.library;

public class AviPlayer implements AdvancedMediaPlayer {

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing *.avi file " + fileName);
    }

}
