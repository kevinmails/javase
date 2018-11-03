package com.test.concurrent;

/**
 * @author Administrator
 */
public class Singleton {

    private static volatile SingletonFoo singletonFoo = null;

    public static SingletonFoo getInstance() {
        if (null == singletonFoo) {
            synchronized (SingletonFoo.class) {
                if (null == singletonFoo) {
                    singletonFoo = new SingletonFoo();
                }
            }
        }
        return singletonFoo;
    }


}
