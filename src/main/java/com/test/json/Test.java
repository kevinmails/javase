package com.test.json;

import com.alibaba.fastjson.JSON;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by KEVIN on 2017/5/22.
 */
public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("ab");
        list.add("acd");
        list.add("ab");
        Map<String, Object> map = new HashMap<String, Object>();
        Person p = new Person("xiaoming", 20);
        Person p2 = new Person("mingxiao", 18);
        map.put("a", "ka");
        map.put("b", "kb");
        map.put("p", p);
        map.put("p2", p2);


        String s = JSON.toJSONString(list);
        String s2 = JSON.toJSONString(map);
        String ps2 = JSON.toJSONString(p2);
        System.out.println(s);
        System.out.println(s2);
        System.out.println(ps2);


        String str = "070008|12";

        String[] arrs = str.split("\\|");
        String id = arrs[arrs.length - 1];
        System.out.println(id);

        Integer i = 128;
        Integer i2 = 128;

        System.out.println(i == i2);
        System.out.println(Objects.equals(i,i2));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfMonth());

        System.out.println(Instant.now().toString());




    }
}
