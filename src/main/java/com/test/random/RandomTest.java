package com.test.random;

import java.security.SecureRandom;

public class RandomTest {

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();


        for (; ; ) {
           int v =  sr.ints(2, 4).findFirst().getAsInt();
            System.out.println(v);
        }


    }
}
