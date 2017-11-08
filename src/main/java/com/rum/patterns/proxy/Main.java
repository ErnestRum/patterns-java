package com.rum.patterns.proxy;

import com.rum.patterns.proxy.library.MusicServiceImpl;

public class Main {

    private MusicDownloader musicDownloaderNative;
    private MusicDownloader musicDownloaderModify;

    private long test(MusicDownloader musicDownloader) {
        long startTime = System.currentTimeMillis();

        musicDownloader.downloadPopular();
        musicDownloader.downloadAudio("gjghl2qn6kh");
        musicDownloader.downloadPopular();
        musicDownloader.downloadAudio("gjghl2qn6kh");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

    private void runMain() {
        musicDownloaderNative = new MusicDownloader(new MusicServiceImpl());
        musicDownloaderModify = new MusicDownloader(new MusicServiceProxy());

        long nativeTest = test(musicDownloaderNative);
        long modifyTest = test(musicDownloaderModify);

        System.out.println("\n" + (nativeTest - modifyTest));
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
