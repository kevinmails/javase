package com.test.thread;

/**
 * @author kevin.chen
 * Date 2024/7/29
 * Time 23:27
 */
public class TreadTest3 {
    public static void main(String[] args) {

        Runnable runnable = () -> {


            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello runnable");


        };
        /**
         * 仅仅只是能过main线程执行run方法
         */
        runnable.run();


     new Thread(() -> {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello thread");

        }).start();

        System.out.println("main");

    }
}
