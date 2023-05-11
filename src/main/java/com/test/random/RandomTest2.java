package com.test.random;

import java.security.SecureRandom;

public class RandomTest2 {

    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();

        int next = sr.nextInt(10);
        System.out.println(next);


    }
}
