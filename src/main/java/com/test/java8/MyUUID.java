package com.test.java8;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class MyUUID {

    public static String getUUID() {
        final AtomicLong counter = new AtomicLong(System.nanoTime());
//        final AtomicLong counter = new AtomicLong(System.currentTimeMillis());
        return String.valueOf(counter.getAndIncrement());
    }


    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public static void main(String[] args) {
        int rCount = 100000000;
        System.out.println("开始随机数生成测试！");
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < rCount; i++) {
//            MyUUID.getUUID();
            System.out.println( MyUUID.getUUID());
        }
        System.out.printf("完成随机数生成，用时" + (System.currentTimeMillis() - begin) + "ms");

        System.out.println("-----------------------------------------------------------------");

        Long begin2 = System.currentTimeMillis();
//        for (int i = 0; i < rCount; i++) {
//            MyUUID.getUuid();
//        }
        System.out.printf("完成随机数生成，用时" + (System.currentTimeMillis() - begin2) + "ms");
//        System.out.println(MyUUID.getUUID());
//        System.out.println(MyUUID.getUuid());
    }
}
