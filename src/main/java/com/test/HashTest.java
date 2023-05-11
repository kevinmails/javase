package com.test;

import lombok.var;

import java.util.Objects;
import java.util.Random;

/**
 * @author 陈彬
 *         Date 2017/7/18
 *         Time 20:54
 */
public class HashTest {

    public static void main(String[] args) {

        String s = "dfsfabsdfsafddfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646abdfasffafafsafasdfa464645646421316548745646";
        System.out.println(s.hashCode()%5);

        var  v = Objects.hashCode(s)& 0x7FFFFFFF;


        System.out.println(v);
        System.out.println(Objects.hashCode(s)&Integer.MAX_VALUE);

        System.out.println(Math.floorMod(-10,3));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(0x7FFFFFFF);
        System.out.println(Integer.toBinaryString(0x7FFFFFFF));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));



    }
}
