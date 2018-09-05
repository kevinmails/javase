package com.test.java8;


import org.apache.commons.httpclient.NameValuePair;

import java.security.Security;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 陈彬
 *         Date 2017/9/7
 *         Time 19:26
 */
public class MapToList {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "kevin");
        map.put("age", "12");


        NameValuePair[] arr = map.entrySet().stream().map(entry -> new NameValuePair(entry.getKey(), entry.getValue())).toArray(NameValuePair[]::new);

        System.out.println(arr.length);


    }
}
