package com.rum.patterns.singleton.singletons;

public enum EnumSingleton {

    INSTANCE;

    public void getInstance() {
        System.out.println(INSTANCE.hashCode());
    }

}
