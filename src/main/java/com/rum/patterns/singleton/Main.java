package com.rum.patterns.singleton;

import com.rum.patterns.singleton.singletons.*;

public class Main {

    private void createSingletons(final SingletonType singletonType) {
        System.out.println("----------" + singletonType + "----------");

        BaseSingleton firstSingleton = BaseSingleton.getInstance(singletonType);
        BaseSingleton secondSingleton = BaseSingleton.getInstance(singletonType);

        System.out.println("First singletone hashcode: " + firstSingleton.hashCode());
        System.out.println("Second singletone hashcode: " + secondSingleton.hashCode());
    }

    private void createSingletonsAsync(final SingletonType singletonType) {
        System.out.println("----------" + singletonType + "----------");

        new Thread(() -> {
            BaseSingleton firstSingleton = BaseSingleton.getInstance(singletonType);
            System.out.println("First singletone hashcode: " + firstSingleton.hashCode());
        }).start();

        new Thread(() -> {
            BaseSingleton secondSingleton = BaseSingleton.getInstance(singletonType);
            System.out.println("Second singletone hashcode: " + secondSingleton.hashCode());
        }).start();
    }

    private void runMain() {
        createSingletons(SingletonType.EAGER);
        createSingletonsAsync(SingletonType.LAZY);
    }

    public static void main(String[] args) {
        new Main().runMain();
    }

}
