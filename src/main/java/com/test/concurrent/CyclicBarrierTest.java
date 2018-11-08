package com.test.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 * 有一个容量为100的box ，两个小朋友向里面放apple，每一人每次放10个，每放一轮打印放进box 的总数
 */
public class CyclicBarrierTest {
    static AtomicInteger box = new AtomicInteger(0);
    static CyclicBarrier barrier = new CyclicBarrier(2, new BarrierAction());
    private static Thread xiaoHong = null;
    private static Thread xiaoMing = null;

    public static void main(String[] args) {
        xiaoMing = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                box.incrementAndGet();
                System.out.println("小明放入第" + i + "个apple");
            }
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        xiaoMing.start();


         xiaoHong = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                box.incrementAndGet();
                ;
                System.out.println("小红放入第" + i + "个apple");
            }
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        xiaoHong.start();

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class BarrierAction implements Runnable {

        @Override
        public void run() {
            System.out.println("本轮操作后box里有" + box.get() + "个apple");
            if (box.get() < 100) {
                System.out.println("box未满，接着放...");
//                barrier.reset();
//                xiaoMing.start();
//                xiaoHong.start();
            }

        }
    }


}
