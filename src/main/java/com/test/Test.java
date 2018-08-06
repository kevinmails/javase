package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by KEVIN on 2016/6/18.
 */
public class Test {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "a1");
        map.put("b", "b1");
        System.out.println(map.keySet().toString());
        System.out.println(map.toString());

        String s = "12zip34abc.zip";

        int ind = s.lastIndexOf(".");

        System.out.println(ind);

        String v = s.substring(0, ind);
        System.out.println(v);

        v = s.replace("zip", "txt");
        System.out.println(StandardCharsets.UTF_8.displayName());
        new EventListener() {
            public void abc() {
                System.out.println("abc");
            }
        }.abc();


    }

    public void call() {
        new MyClass() {
            public void say2() {
                System.out.print("world!");
            }
        }.say();

    }


    class MyClass {

        public void say() {
            System.out.print("hello!");
            return;
        }

    }

    public void t1(String a, boolean b) {


    }

    public void t1(boolean b, String a) {


    }


}
