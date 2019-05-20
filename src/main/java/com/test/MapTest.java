package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin.chen
 * Date 2019/1/24
 * Time 18:52
 */
public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "a1");
        map1.put("b", "b1");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "a3");
        map2.put("c", "c1");


        map1.putAll(map2);


        map1.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });


    }
}
