package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kevin.chen
 * Date 2023/9/13
 * Time 10:57
 */
public class ListFilter {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("015815");
        list.add("025815");
        list.add("015615");
        list.add("315815");

        List<String> list2 = new ArrayList<>();
        list2.add("015815s");


        List<String> r = list.stream().filter(code -> !list2.contains(code)).collect(Collectors.toList());
        System.out.println(r);


    }
}
