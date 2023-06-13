package com.test.lombok;

import java.util.List;

/**
 * @author kevin.chen
 * Date 2023/5/30
 * Time 08:40
 * @Builder" 注解无法支持，父类属性的链式赋值
 */
public class Test {
    public static void main(String[] args) {

        Apple apple = Apple.builder().color("red").name("abc").build(); //@Builder使用报错name无法赋值

        Fruit fruit = Fruit.builder().name("haha").build();

        Basket basket = Basket.builder().addF("abc").addF("def").build();

       List<String> f = basket.f;
       f.stream().forEach(System.out::println);

    }
}
