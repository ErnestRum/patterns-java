package com.rum.patterns.adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()) {
            case "mp3":
                System.out.println("Playing *.mp3 file " + fileName);
                break;
            case "avi":
                mediaAdapter = new MediaAdapter("avi");
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Can't play file, " + audioType + " not supported");
                break;
        }
    }

}
