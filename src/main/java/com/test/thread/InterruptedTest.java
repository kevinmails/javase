package com.test.thread;

/**
 * @author kevin.chen
 * Date 2019/1/29
 * Time 16:31
 */
public class InterruptedTest extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("go run ...");
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
//            Thread.currentThread().interrupt();
        }
        System.out.println("go go go");
    }

    public static void main(String[] args) {
        InterruptedTest test = new InterruptedTest();
        test.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test.interrupt();


    }
}
