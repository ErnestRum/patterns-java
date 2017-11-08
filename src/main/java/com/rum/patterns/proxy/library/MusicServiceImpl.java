package com.rum.patterns.proxy.library;

import java.util.HashMap;

public class MusicServiceImpl implements MusicService {

    @Override
    public HashMap<String, Audio> getPopularAudios() {
        connectToServer("musicservice");
        return getPopular();
    }

    @Override
    public Audio getAudio(String id) {
        connectToServer("musicservice");
        return getRandomAudio();
    }

    private HashMap<String, Audio> getPopular() {
        HashMap<String, Audio> map = new HashMap<>();
        map.put("sa2has6gd2as", new Audio("sa2has6gd2as", "song1.mp3", "/path/song1.mp3"));
        map.put("fjrkl4h6l123", new Audio("fjrkl4h6l123", "song2.mp3", "/path/song2.mp3"));
        map.put("asdgk2kl6np1", new Audio("asdgk2kl6np1", "song3.mp3", "/path/song3.mp3"));

        return map;
    }

    private Audio getRandomAudio() {
        Audio audio = new Audio("gjghl2qn6kh", "song4.mp3", "/path/song4.mp3");
        return audio;
    }


    private void connectToServer(String server) {
        System.out.println("\nConnecting to " + server + " server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connected!");
    }

}
