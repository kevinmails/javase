package com.test;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * @author 陈彬
 *         Date 2017/7/7
 *         Time 10:50
 */
public class Base64Test {

    public static void main(String[] args) throws IOException {

        String src = "hello word!";

        BASE64Encoder encoder = new BASE64Encoder();
        String target = encoder.encode(src.getBytes());
        System.out.println(target);



        Base64 base64 = new Base64();
        byte[] bytes = base64.encode(src.getBytes());
        String myStr = new String(bytes);
        System.out.println(myStr);

        BASE64Decoder decoder = new BASE64Decoder();

        System.out.println(new String(decoder.decodeBuffer(myStr)));


    }
}
