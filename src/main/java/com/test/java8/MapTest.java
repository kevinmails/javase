package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author 陈彬
 *         Date 2017/7/22
 *         Time 13:24
 */
public class MapTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

         list.stream().map(x -> x+1).forEach(System.out::println);

        LongAdder longAdder = new LongAdder();
        longAdder.add(10L);
        longAdder.increment();
        System.out.println(longAdder.longValue());




    }
}
