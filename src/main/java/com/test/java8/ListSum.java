package com.test.java8;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/10/13
 *         Time 14:45
 */
public class ListSum {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("kevin", 20, new BigDecimal(165))
                , new Person("xiaoming", 25, new BigDecimal(180)));
//        List<Person> list = Arrays.asList();


        // 对list中 Person的属性Height 求和
        BigDecimal i = list.stream().map(Person::getHeight).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(i);

    }
}
