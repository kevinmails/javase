package com.test;

import org.apache.commons.codec.binary.Base64;

/**
 * @author 陈彬
 * Date 2017/7/7
 * Time 10:50
 */
public class Base64Test {

    public static void main(String[] args) {

        String src = "hello word!";

        Base64 encoder = new Base64();
        byte[] target = encoder.encode(src.getBytes());
        System.out.println(new String(target));


        Base64 base64 = new Base64();
        byte[] bytes = base64.encode(src.getBytes());
        String myStr = new String(bytes);
        System.out.println(myStr);

        Base64 decoder = new Base64();

        System.out.println(new String(decoder.decode(myStr)));


    }
}
