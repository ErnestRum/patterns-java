package com.rum.patterns.singleton.singletons;

import com.rum.patterns.singleton.SingletonType;

public abstract class BaseSingleton {

    public static BaseSingleton getInstance(SingletonType singletonType) {
        switch (singletonType) {
            case EAGER:
                return EagerSingleton.getInstance();
            case LAZY:
                return LazySingleton.getInstance();
            case THREAD_SAFE:
                return ThreadSafeSingleton.getInstance();
            case BILL_PUGH:
                return BillPughSingleton.getInstance();
        }

        return null;
    }

}
