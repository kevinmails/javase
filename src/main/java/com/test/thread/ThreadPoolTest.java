package com.test.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author kevin.chen
 * Date 2019/5/16
 * Time 16:54
 * <p>
 * 线程池的基本功能测试
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 11, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1), new ThreadFactoryBuilder().setNameFormat("程序猿-%d").build(), (r, executor) -> {
            //队列和maximumPoolSize都满了以后的拒绝
            System.out.println("亲，忙不过来了！！");
        });

        //先提交11个task到线程池，此时corePool会被打满,Queue会增加一个task
        for (int i = 0; i < 11; i++) {
            pool.execute(() -> {
                try {
                    Thread.sleep(40000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());

            });
        }


        //再次提交一个task，会新开个线程，此时达队到最大线程池数量(因为Queue总共只能放一个task,所以不会加到列里)
        pool.execute(() -> {
            for (int i = 0; i < 100000000; i++) {
                System.out.println("PoolSize:" + pool.getPoolSize() + " CorePoolSize:" + pool.getCorePoolSize());
                System.out.println(Thread.currentThread().getName() + "搬砖中...");
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("这一定不是真相，一家人都指望我这点工资呢，好好看活，再看看吧！");
                }
            }


        });


        //这次提交会触发拒绝策略
        pool.execute(() -> {
            for (int i = 0; i < 100000000; i++) {
                System.out.println("PoolSize:" + pool.getPoolSize() + " CorePoolSize:" + pool.getCorePoolSize());
                System.out.println(Thread.currentThread().getName() + "搬砖中...");
            }

        });


        Thread.sleep(1000 * 70);
        // 再次提交task到线程池
        pool.execute(() -> {
            for (int i = 0; i < 100000000; i++) {
                System.out.println("PoolSize:" + pool.getPoolSize() + " CorePoolSize:" + pool.getCorePoolSize());
                System.out.println(Thread.currentThread().getName() + " 又来搬砖中...");
            }


        });


    }
}
