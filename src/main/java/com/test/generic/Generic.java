package com.test.generic;

import java.util.Arrays;

/**
 * @author 陈彬
 *         Date 2018/4/15
 *         Time 12:25
 */
public class Generic {

    public void test() {

    }

   public   <T> T getResult( T r){
        return r;
    }

    public <T> void  show(T... ags){
        Arrays.stream(ags).forEach(System.out::println);
    }
}
