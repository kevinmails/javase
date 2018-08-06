package com.test.java8;

import java.util.StringTokenizer;

/**
 * @author 陈彬
 *         Date 2017/7/6
 *         Time 20:36
 */
public class StringTokenizerTest {
    public static void main(String[] args) {


        String s = "2017-10-13,3177001580784375,0.04,钱水芬,,,,,,0001-01-01 00:00:00,0001-01-01";
        StringTokenizer tokenizer = new StringTokenizer(s, ",");

        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }



    }
}
