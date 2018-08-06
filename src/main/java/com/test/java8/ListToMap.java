package com.test.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 陈彬
 *         Date 2017/10/27
 *         Time 1:04
 */
public class ListToMap {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("kevin", 20, new BigDecimal(165))
                , new Person("xiaoming", 25, new BigDecimal(180)));

        Map<String, Person> map = list.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
        System.out.println(map.size());

    }
}
