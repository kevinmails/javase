package com.test.random;

import com.test.java8.PidTest;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 生成一个非连续的id
 */
public class MyUUID {
    static final AtomicLong counter;

    static {
        SecureRandom secureRandom = new SecureRandom();

        //生成一个2-99999的随机数
        long r = secureRandom.longs(2, 100000).findFirst().getAsLong();

        //尽量保证在分布式环境下唯一,理论上不太可能重复
        counter = new AtomicLong(System.nanoTime() + r + PidTest.getPid());
    }

    public static String getUUID() {
        return String.valueOf(counter.getAndIncrement());
    }


    public static String getUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public static void main(String[] args) {
        int rCount = 10000000;
        System.out.println("开始随机数生成测试！");
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < rCount; i++) {
            System.out.println(MyUUID.getUUID());
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
