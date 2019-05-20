package com.test.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author 陈彬
 *         Date 2017/11/15
 *         Time 12:36
 */
public class ThreadTest {
    public static void main(String[] args) {


        ThreadFactory factory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

        ThreadPoolExecutor thread = new MonitorThreadPoolExecutor(2, 10
                , 2, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2), factory);

        for (int i = 0; i < 10; i++) {
            Future<?> future = thread.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    throw new RuntimeException("a");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
        thread.shutdown();


        while (!thread.getQueue().isEmpty()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("队列大小:" + thread.getQueue().size());


        }

        Executors.newWorkStealingPool();


    }
}
