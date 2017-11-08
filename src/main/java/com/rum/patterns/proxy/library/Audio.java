package com.rum.patterns.proxy.library;

public class Audio {

    private String id;
    private String title;
    private String src;

    public Audio(String id, String title, String src) {
        this.id = id;
        this.title = title;
        this.src = src;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSrc() {
        return src;
    }

}
