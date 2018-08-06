package com.test.java8;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * @author 陈彬
 *         Date 2017/7/6
 *         Time 20:31
 */
public class StringJoinerTest {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("|");
        stringJoiner.add("name");
        stringJoiner.add("");
        stringJoiner.add("sex");
        System.out.println(stringJoiner.toString());


        stringJoiner = new StringJoiner(",", "[", "]");
        stringJoiner.add("name");
        stringJoiner.add("sex");
        System.out.println(stringJoiner.toString());
        // 3
        stringJoiner = new StringJoiner(",").add("name").add("sex");
        System.out.println(stringJoiner.toString());

        // 4
        String collect = Arrays.asList("name", "sex").stream().collect(Collectors.joining(","));
        System.out.println(collect);

        String collect2 = Arrays.asList("name", "sex").stream().map(s-> s.toLowerCase())
                .collect(Collectors.joining());
        System.out.println(collect2);

    }
}
