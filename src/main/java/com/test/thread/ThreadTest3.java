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
 * 程序鎱"老实版"
 */
public class ThreadTest3 {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(), new ThreadFactoryBuilder().setNameFormat("程序猿-%d").build());


        for (int i = 0; i < 10; i++) {
            pool.execute(() -> {
                System.out.println(Thread.currentThread().getName());

            });
        }

        pool.execute(() -> {
            for (int i = 0; i < 100000000; i++) {
                System.out.println(Thread.currentThread().getName() + "搬砖中...");
                if (Thread.interrupted()) {
                    System.out.println("这一定不是真相，一家人都指望我这点工资呢，好好看活，再看看吧！");
                }
            }


        });

        Thread.sleep(3000);
        System.out.println("程序猿A：听说公司融的钱烧光了公司要完了，跑吧兄弟们！");
        pool.shutdownNow();
        System.out.println("pool is shutdown!");
        System.out.println("pool.isShutdown()=" + pool.isShutdown());
        System.out.println("pool.isTerminated()=" + pool.isTerminated());


    }
}
