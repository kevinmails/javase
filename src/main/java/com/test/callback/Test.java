package com.test.callback;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by KEVIN on 2016/11/26.
 */
public class Test {

    public static void main(String[] args) {
        Express express = new Express();
        express.receiveExpress(new CallBack() {

            @Override
            public void returnOrder(String expressOrderNo) {
                System.out.println("收到单号：" + expressOrderNo);
            }
        });

        express.receiveExpress(expressOrderNo -> {
            System.out.println(expressOrderNo);
        });
        express.receiveExpress(System.out::print);


        List<String> words = Arrays.asList("apple", "banana", "pear");
        words.sort(new Comparator<String>() {

            @Override
            public int compare(String w1, String w2) {
                return Integer.compare(w1.length(), w2.length());
            }

        });
        words.sort((a, b) -> a.compareTo(b));
        words.forEach(wd -> System.out.println(wd));

    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {

        }
    });
}
