package com.test.polymorphism;

/**
 * @author kevin.chen
 * Time 08:54
 * <p>
 * java多态测试
 */
public class PolymorphismTest {


    public static void main(String[] args) {

        Apple apple = new RedApple();

        /**
         * 因为java静态绑定（编译期绑定），所以这里的color是null
         */
        System.out.println(apple.color);
        apple.myColor();//这里是动态绑定


    }
}
