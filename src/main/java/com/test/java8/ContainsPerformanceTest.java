package com.test.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kevin.chen
 * Date 2018/12/6
 * Time 17:02
 * 对比list和set的查询性能
 */
public class ContainsPerformanceTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        System.out.println("数据准备中...");
        for (int i = 0; i < 10000000; i++) {

            int r = RandomUtil.getRandomIntInRange(1, 5000000);

            list.add(r);
            set.add(r);
        }


        System.out.println("数据准备完成.");

        long bg = System.currentTimeMillis();
        System.out.println("list查找到:" + list.contains(6666));
        System.out.println("list查找用户时" + (System.currentTimeMillis() - bg) + "ms");

        long bg2 = System.currentTimeMillis();
        System.out.println("set查找到:" + set.contains(666));
        System.out.println("set查找用户时" + (System.currentTimeMillis() - bg2) + "ms");


    }
}
