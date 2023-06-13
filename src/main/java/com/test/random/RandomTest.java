package com.test.random;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 陈彬
 * Date 2018/8/31
 * Time 17:34
 */
public class RandomTest {

    public static void main(String[] args) {
        for (; ; ) {
            Set<Integer> set = new HashSet<>(1);
            set.add(1);
            int radom = RandomUtil.getRandomIntInRangeWithExclude(1, 2, set);
            System.out.println(radom);
        }

    }
}
