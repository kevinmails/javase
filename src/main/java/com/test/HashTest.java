package com.test;

import java.util.Objects;

/**
 * @author 陈彬
 *         Date 2017/7/18
 *         Time 20:54
 */
public class HashTest {

    public static void main(String[] args) {

        String s = "dfsfabsdfsafddfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646";
        System.out.println(s.hashCode()%5);

        System.out.println(Objects.hashCode(s)& 0x7FFFFFFF);
        System.out.println(Objects.hashCode(s)&Integer.MAX_VALUE);

        System.out.println(Math.floorMod(-10,3));
        int i  = Integer.MIN_VALUE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(0x7FFFFFFF);


    }
}
