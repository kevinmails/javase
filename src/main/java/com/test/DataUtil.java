package com.test;

/**
 * Created by KEVIN on 2016/11/25.
 */
public interface DataUtil {

    static void getDate(){
        System.out.println("abc");
    }

    default void hello(){
        System.out.println("hello");
    }
}
