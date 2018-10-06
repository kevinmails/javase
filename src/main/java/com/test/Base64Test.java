package com.test;

import org.apache.commons.codec.binary.Base64;

/**
 * @author 陈彬
 * Date 2017/7/7
 * Time 10:50
 */
public class Base64Test {

    public static void main(String[] args) {

        var src = "hello word!";

        var encoder = new Base64();
        var target = encoder.encodeAsString(src.getBytes());
        System.out.println(target);

        var decoder = new Base64();

        System.out.println(new String(decoder.decode(target)));


    }
}
