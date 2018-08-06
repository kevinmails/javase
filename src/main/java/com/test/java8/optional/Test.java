package com.test.java8.optional;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * @author 陈彬
 *         Date 2018/3/7
 *         Time 16:03
 */
public class Test {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("abc");
        optional.ifPresent(System.out::print);
        optional.orElseGet(()-> "123");

    }
}
