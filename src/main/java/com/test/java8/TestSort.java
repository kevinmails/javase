package com.test.java8;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 陈彬
 *         Date 2017/8/18
 *         Time 19:51
 */
public class TestSort {
    public static void main(String[] args) {

        List<SortableBean> beans = new ArrayList<>();
        beans.add(new SortableBean("070008", BigDecimal.ONE, "", 26));
        beans.add(new SortableBean("000359", BigDecimal.TEN, "", 30));
        beans.add(new SortableBean("000343", new BigDecimal(6), "Y", 18));

//        beans.stream().sorted(Comparator.comparing(SortableBean::getAmt).reversed()
//                .thenComparing(SortableBean::getRecommend)).forEach((s) -> System.out.println(s.getCode()));
//
//        System.out.println("----------------");
        beans.stream().sorted((SortableBean o1, SortableBean o2) -> {
            return o2.getAge() - o1.getAge();
        }).sorted((o1, o2) -> {
            if (!Strings.isNullOrEmpty(o1.getRecommend())&& !Strings.isNullOrEmpty(o2.getRecommend())) {
                return o1.getRecommend().compareTo(o2.getRecommend());
            }
            return 1;
        }).forEach((s) -> System.out.println(s));



    }
}
