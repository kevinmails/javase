package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/7/13
 *         Time 19:51
 */
public class ListRemoveTest {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("d");
        list.add("b");
        list.add("e");

        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);
            if (s.equals("b")) {
                String rmStr = list.remove(i);
                System.out.println(rmStr);
                i--;
            }

        }

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == 2) {
//                list.remove(i);
//            }
//        }


    }
}
