package com.test.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Administrator
 * <p>
 * CyclicBarrier 的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，
 * 直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续干活。CyclicBarrier默认的构造方法是CyclicBarrier(int parties)，
 * 其参数表示屏障拦截的线程数量，每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞。
 */
public class CyclicBarrierTest2 {

    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("两个线程都达到了屏障点"));

        new Thread(() -> {

            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {

                e.printStackTrace();
            }
            System.out.println("s1");
        }).start();

        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("m1");
    }
}
