package com.rum.patterns.adapter;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("avi", "clip1.avi");
        audioPlayer.play("mp4", "clip2.mp4");
    }

}
