package com.rum.patterns.singleton.singletons;

public final class EagerSingleton extends BaseSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
