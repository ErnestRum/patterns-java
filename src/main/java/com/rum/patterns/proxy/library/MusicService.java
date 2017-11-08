package com.rum.patterns.proxy.library;

import java.util.HashMap;

public interface MusicService {

    HashMap<String, Audio> getPopularAudios();

    Audio getAudio(String id);

}
