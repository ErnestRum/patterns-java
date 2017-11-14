package com.rum.patterns.observer.publisher;

import com.rum.patterns.observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> events = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.events.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = events.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> listeners = events.get(eventType);
        listeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> listeners = events.get(eventType);
        for (EventListener listener : listeners) {
            listener.update(eventType, file);
        }
    }

}
