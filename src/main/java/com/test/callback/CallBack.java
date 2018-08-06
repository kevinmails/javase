package com.test.callback;

/**
 * Created by KEVIN on 2016/11/26.
 */
@FunctionalInterface
public interface CallBack {

    void returnOrder(String expressOrderNo);

    boolean equals(Object obj);

    //        boolean call();
    default void call2() {
        System.out.println("abc");
    }

}
