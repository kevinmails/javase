package com.test.generic;

import org.checkerframework.checker.units.qual.A;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 12:03
 */
public class Test {
    public static void main(String[] args) {

        Plate<? super Fruit> plate = new Plate<>();

        plate.put(new Apple("Apple"));

       Food fruit= (Food) plate.get();
        fruit.print("ab");
        fruit.print("bb",2);
        fruit.print(3,"cc");



        List< ? extends Food>  list = new ArrayList<>();








        System.out.println( Test.Query("abc"));
        System.out.println( Test.Query(1.2));
        Test.Qurey2("kevin", 20);

    }

    /**
     * 一人泛型入参
     * @param req
     * @param <T>
     * @return
     */
    public static  <T> String Query(T req) {

        return String.valueOf(req);
    }

    public static <T,K> void Qurey2(T p1, K p2) {
        System.out.println(p1);
        System.out.println(p2);
    }

}
