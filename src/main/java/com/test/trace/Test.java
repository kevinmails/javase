package com.test.trace;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * Created by KEVIN on 2017/5/21.
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor pools = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);

        for (int i = 0; i < 80; i++) {

            pools.execute(() -> {
                TraceUser user = new TraceUser(UUID.randomUUID().toString().substring(10, 15));
                user.getUp();
                user.brushTooth();
                user.eatBreakfast();
            });
        }

        System.out.println(pools.getPoolSize());
        System.out.println(pools.getActiveCount());

        Thread.sleep(1000);
        System.out.println(pools.getPoolSize());
        System.out.println(pools.getActiveCount());
        BlockingQueue queue = pools.getQueue();
        System.out.println(queue.size());
        if (pools.getActiveCount() == 0) {
            pools.shutdown();
        }

    }


}
