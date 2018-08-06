package com.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

/**
 * @author 陈彬
 *         Date 2017/8/11
 *         Time 14:48
 */
public class TestBit {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "是";
        String s2 = "a";


        System.out.println(s.getBytes("utf-8").length);
        System.out.println(s2.getBytes().length);
        String csn = Charset.defaultCharset().name();
        System.out.println(csn);

//        Charset.availableCharsets().forEach((key, value) -> {
//            System.out.println(key + "     " + value);
//        });



    }
}
