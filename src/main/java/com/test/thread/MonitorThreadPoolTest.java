package com.test.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class MonitorThreadPoolTest {
    public static void main(String[] args) {

        ExecutorService pool = new MonitorThreadPoolExecutor(5, 10, 20L,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10), new ThreadFactoryBuilder().setNameFormat("程序猿-%d").build());


        for (int i = 0; i < 10; i++) {
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName());

            });
        }

        for (int i = 0; i < 10; i++) {
            pool.submit(() -> {
                System.out.println(Thread.currentThread().getName());

            });
        }

    }
}
