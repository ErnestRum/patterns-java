package com.rum.patterns.proxy;

import com.rum.patterns.proxy.library.Audio;
import com.rum.patterns.proxy.library.MusicService;

import java.util.HashMap;

public class MusicDownloader {

    private MusicService musicService;

    public MusicDownloader(MusicService musicService) {
        this.musicService = musicService;
    }

    public void downloadAudio(String id) {
        Audio audio = musicService.getAudio(id);
        System.out.println("\nLoaded audio:");
        System.out.println(audio.getTitle());
    }

    public void downloadPopular() {
        HashMap<String, Audio> audios = musicService.getPopularAudios();
        System.out.println("\nPopular audios:");
        for (Audio audio : audios.values()) {
            System.out.println(audio.getTitle());
        }
    }

}
