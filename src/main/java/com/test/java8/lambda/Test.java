package com.test.java8.lambda;

import lombok.var;

/**
 * @author 陈彬
 * Date 2018/8/6
 * Time 13:33
 */
public class Test {
    public static void main(String[] args) {

        Pilot pilot = Pilot.builder().name("kevin").build();
        pilot.introduce(System.out::println);

        var airplane = new Airplane() {
            @Override
            public void fly(String type) {
                System.out.println(type + "在飞行");
            }
        };

        airplane.fly("客机");



    }
}
