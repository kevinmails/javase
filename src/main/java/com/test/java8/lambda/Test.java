package com.test.java8.lambda;

/**
 * @author 陈彬
 * Date 2018/8/6
 * Time 13:33
 */
public class Test {
    public static void main(String[] args) {

    Pilot pilot = Pilot.builder().name("kevin").build();
    pilot.introduce(type -> System.out.println(type));

    }
}
