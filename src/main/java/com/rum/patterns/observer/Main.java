package com.rum.patterns.observer;

import com.rum.patterns.observer.listeners.EmailNotificationListener;
import com.rum.patterns.observer.listeners.LocalNotificationListener;

public class Main {

    private FileEditor fileEditor;

    private void init() {
        fileEditor = new FileEditor();
        fileEditor.events.subscribe("open", new EmailNotificationListener("admin@example.com"));
        fileEditor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        fileEditor.events.subscribe("edit", new EmailNotificationListener("admin@example.com"));
        fileEditor.events.subscribe("open", new LocalNotificationListener("/logFile.txt"));
    }

    private void runMain() {
        init();

        fileEditor.openFile("testFile.txt");
        fileEditor.editFile("testFile.txt");
        fileEditor.saveFile("testFile.txt");
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
