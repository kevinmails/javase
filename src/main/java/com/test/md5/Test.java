package com.test.md5;

/**
 * @author 陈彬
 * Date 2018/9/5
 * Time 16:09
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Md5.byte2hexString("abc".getBytes()));
        System.out.println(CryptTool.byteArrayToHexString("abc".getBytes()));

    }
}
