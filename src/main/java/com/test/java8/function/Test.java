package com.test.java8.function;

import com.test.java8.Person;
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
        map.put("a", "a1");
        map.put("b", "b1");
        map.put("c", "c1");
        map.put("d", "d1");
        map.forEach((k, v) -> {
                    System.out.println(k);
                    System.out.println(v);
                }
        );

        map.forEach(Person::new);

    }

}
