package com.test;

import lombok.var;

/**
 * @author kevin.chen
 * Date 2023/5/6
 * Time 16:32
 * 测试java字面量
 */
public class literalTest {

    public static void main(String[] args) {

        int v1 = 10;
        int v2 = 010;
        var v3 = 0xFF;//十六进制
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);


    }
}
