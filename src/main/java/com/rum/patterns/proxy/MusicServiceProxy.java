package com.rum.patterns.proxy;

import com.rum.patterns.proxy.library.Audio;
import com.rum.patterns.proxy.library.MusicService;
import com.rum.patterns.proxy.library.MusicServiceImpl;

import java.util.HashMap;

public class MusicServiceProxy implements MusicService {

    private MusicService musicService;
    private HashMap<String, Audio> cachedPopular;
    private HashMap<String, Audio> cachedAll;

    public MusicServiceProxy() {
        this.musicService = new MusicServiceImpl();
        this.cachedPopular = new HashMap<>();
        this.cachedAll = new HashMap<>();
    }

    @Override
    public HashMap<String, Audio> getPopularAudios() {
        if (cachedPopular.isEmpty()) {
            cachedPopular = musicService.getPopularAudios();
        }

        return cachedPopular;
    }

    @Override
    public Audio getAudio(String id) {
        Audio audio = cachedAll.get(id);
        if (audio == null) {
            audio = musicService.getAudio(id);
            cachedAll.put(id, audio);
        }

        return audio;
    }

}
