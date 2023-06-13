package com.test.polymorphism;

/**
 * @author kevin.chen
 * Date 2023/5/24
 * Time 09:03
 */
public class RedApple extends Apple {
    String color = "red";

    @Override
    void myColor() {
        System.out.println(this.color);
    }
}
