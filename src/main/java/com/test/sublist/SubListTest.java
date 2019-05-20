package com.test.sublist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin.chen
 * Date 2019/1/17
 * Time 14:56
 */
public class SubListTest {
    public static void main(String[] args) {


//        List<String> srcList = Arrays.asList("a","b","c","d","e","f");
        List<String> srcList = new ArrayList<>();
        srcList.add("a");
        srcList.add("b");
        srcList.add("c");
        srcList.add("d");
        srcList.add("e");
        srcList.add("f");


        List<String> usedList = srcList.subList(1, 2);
        srcList.forEach(System.out::println);
        usedList.add("abc");

        usedList.clear();
        usedList.add("abc");
        srcList.add("haha");

        srcList.forEach(System.out::println);



        //拿着usredList 做后续的操作....


    }
}
