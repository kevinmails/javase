package com.test;

import java.math.BigDecimal;

/**
 * @author 陈彬
 * Date 2018/12/2
 * Time 14:56
 */
public class BigDecimalCompareTest {
    public static void main(String[] args) {


        System.out.println(new BigDecimal("5").compareTo(BigDecimal.TEN));
        System.out.println(new BigDecimal("10").compareTo(BigDecimal.TEN));
        System.out.println(new BigDecimal("12").compareTo(BigDecimal.TEN));



    }
}
