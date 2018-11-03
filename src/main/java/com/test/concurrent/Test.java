package com.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        ExecutorService poolExecutor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100000; i++) {

            poolExecutor.execute(() -> System.out.println(Singleton.getInstance()));
        }
        poolExecutor.shutdown();


    }
}
