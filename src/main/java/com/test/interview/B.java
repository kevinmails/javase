package com.test.interview;

public class B {
    public static void main(String[] args) {
        A a1 = new A();

        System.out.println("a1.i = " + a1.i);
        System.out.println("a2.i = " + a2.i);
    }

    static A a2 = new A();
}
