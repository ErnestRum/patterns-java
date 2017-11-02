package com.rum.patterns.singleton.singletons;

public final class ThreadSafeSingleton extends BaseSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

}
