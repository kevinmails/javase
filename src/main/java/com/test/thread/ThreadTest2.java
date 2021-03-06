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
 * 程序鎱"精明版"
 */
public class ThreadTest2 {

    public ThreadTest2() {
        super();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(5), new ThreadFactoryBuilder().setNameFormat("程序猿-%d").build());


        for (int i = 0; i < 10; i++) {
            int finalI = i;
            pool.execute(() -> {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " i=" + finalI);

            });
        }

        pool.execute(() -> {
            for (int i = 0; i < 100000000; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "搬砖中...");
                System.out.println("PoolSize:" + pool.getPoolSize() +" CorePoolSize:" + pool.getCorePoolSize());
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("老板跑路了，没人发工资了，还干啥，不干了！");
                    return;
                }
            }


        });

        Thread.sleep(5000);
        System.out.println("程序猿A听说公司融的钱烧光了公司要完了，跑吧兄弟们！");
        pool.shutdown();
        pool.shutdownNow();
        System.out.println("pool is shutdown!");
        System.out.println("pool.isShutdown()=" + pool.isShutdown());
        System.out.println("pool.isTerminated()=" + pool.isTerminated());


    }
}
