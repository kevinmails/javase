package com.test.paging;

import java.util.Arrays;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/11/9
 *         Time 18:05
 */
public class ListPagingTest {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("ab", "ce", "re", "asf", "saf", "abc", "111");

        PagingList<String> paging = new PagingList<>(list, 2);


        while (paging.hasNext()) {
            paging.next().forEach(System.out::println);
        }

        System.out.println(list.size());


    }


}
