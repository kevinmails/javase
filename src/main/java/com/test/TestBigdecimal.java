package com.test;

import java.math.BigDecimal;

/**
 * Created by KEVIN on 2017/4/19.
 */
public class TestBigdecimal {

    public static void main(String[] args) {

        BigDecimal decimal = new BigDecimal(20.001);
        System.out.println(decimal.scale());
        String v = "";
        if (new BigDecimal(decimal.intValue()).compareTo(decimal) == 0) {
            v = String.valueOf(decimal.intValue());
        } else {
            v = String.valueOf(decimal.doubleValue());
        }

        System.out.println(v);

        BigDecimal bigDecimal = new BigDecimal("1000");
        System.out.println(bigDecimal.scale());


        System.out.println(Integer.MAX_VALUE);

        System.out.println( new BigDecimal("99.97").multiply(new BigDecimal(100)).longValue());

        System.out.println( new BigDecimal("99.97").compareTo( new BigDecimal("190.97")));
    }
}
