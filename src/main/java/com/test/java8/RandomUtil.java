package com.test.java8;

import java.util.Random;

/**
 * 生成指定区间的随机数
 *
 * @author Administrator
 */
public interface RandomUtil {
    Random r = new Random();

    static void main(String[] args) {

        for (; ; ) {
            System.out.println(getRandomStringInRange(10000000, 99999999));
            System.out.println(getRandomIntInRange(100, 999));
        }
    }

    /**
     * @param min
     * @param max
     * @return Random number
     */

    static int getRandomIntInRange(int min, int max) {
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }

    /**
     * @param min
     * @param max
     * @return Random number string
     */
    static String getRandomStringInRange(int min, int max) {
        return String.valueOf(r.ints(min, (max + 1)).limit(1).findFirst().getAsInt());
    }
}
