package com.test.arr;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.Arrays;

/**
 * Created by KEVIN on 2017/6/21.
 */
public class Test {
    public static void main(String[] args) {

        String line = "070008|0|207|357832658||887813182470|071A14938943|18068231911";

        String[] lineArr = line.split("\\|");
        String userId = lineArr[lineArr.length - 1];
        System.out.println(userId);
        System.out.println(lineArr.length);

        Arrays.asList(lineArr).forEach(
                arr -> System.out.println(arr)
        );




    }


}
