package com.test.generic;

/**
 * @author 陈彬
 *         Date 2018/4/15
 *         Time 12:27
 */
public class GenericTest {

    public static void main(String[] args) {

        Generic g = new Generic();
        g.getResult("a");
        g.getResult(123);
        g.show(1,2);
    }
}
