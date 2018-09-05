package com.test.java8;

import java.util.Random;

/**
 * @author 陈彬
 * Date 2018/8/31
 * Time 17:34
 */
public class RandomTest {

    public static void main(String[] args) {
        Random r = new Random();
        for(;;){
            int radom = r.ints(2, (5 + 1)).findFirst().getAsInt();
            System.out.println(radom);

        }



    }
}
