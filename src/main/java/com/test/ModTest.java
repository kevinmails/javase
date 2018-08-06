package com.test;

/**
 * @author 陈彬
 *         Date 2017/11/7
 *         Time 9:15
 */
public class ModTest {

    public static void main(String[] args) {

        for (int i = 0; i < 200; i++) {

            int r = i;
            int b = 15;
            System.out.println(r + " mod后：" + r % b);

        }


    }
}
