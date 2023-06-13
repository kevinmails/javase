package com.test.random;

import java.security.SecureRandom;

public class RandomTest3 {

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();


        for (; ; ) {
           int v =  sr.ints(10, 100000).findFirst().getAsInt();
            System.out.println(v);
        }


    }
}
