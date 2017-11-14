package com.rum.patterns.observer.listeners;

import java.io.File;

public class LocalNotificationListener implements EventListener {

    private File logFile;

    public LocalNotificationListener(String logFileName) {
        this.logFile = new File(logFileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + logFile + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
