package com.test.java8.function;

import com.test.java8.identity.IdentityCard;
import com.test.java8.identity.IdentityCardUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @author 陈彬
 * Date 2018/1/13
 * Time 10:51
 */
public class Test {

    public static void main(String[] args) {

        int a = 10;
        FunctionDemo.modifyTheValue(a, c -> c + a);

        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        map.forEach((k, v) -> {
                    System.out.println(k);
                    System.out.println(v);
                }
        );

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s);
                System.out.println(s2);
            }
        });

    }

}
