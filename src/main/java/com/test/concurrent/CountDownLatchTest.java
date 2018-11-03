package com.test.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 * CountDownLatch 类测试
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);


        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(() -> {

            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + ":get:s" + i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "run over!");
            latch.countDown();
        });

        service.execute(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + ":get:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "run over!");
            latch.countDown();


        });

        System.out.println("等待线程执行。。。。。");
        latch.await();
        System.out.println("所有线程已经执行完成");
        service.shutdown();


    }
}
