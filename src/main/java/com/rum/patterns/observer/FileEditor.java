package com.rum.patterns.observer;

import com.rum.patterns.observer.publisher.EventManager;

import java.io.File;

public class FileEditor {

    public EventManager events;
    private File file;

    public FileEditor() {
        this.events = new EventManager("open", "save", "edit");
    }

    public void openFile(String fileName) {
        this.file = new File(fileName);
        events.notify("open", file);
    }

    public void saveFile(String fileName) {
        this.file = new File(fileName);
        events.notify("save", file);
    }

    public void editFile(String fileName) {
        this.file = new File(fileName);
        events.notify("edit", file);
    }

}
