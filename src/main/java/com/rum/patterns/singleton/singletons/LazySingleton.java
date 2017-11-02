package com.rum.patterns.singleton.singletons;

public final class LazySingleton extends BaseSingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

}
