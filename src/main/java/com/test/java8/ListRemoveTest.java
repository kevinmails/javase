package com.test.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin.chen
 * Date 2019/4/2
 * Time 12:04
 */
public class ListRemoveTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).equals("b")) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

}
