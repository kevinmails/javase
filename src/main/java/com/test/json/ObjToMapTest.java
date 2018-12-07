package com.test.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * @author kevin.chen
 * Date 2018/12/7
 * Time 16:17
 */
public class ObjToMapTest {
    public static void main(String[] args) {
        Person p = new Person("xiaoming", 20);

        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.convertValue(p, new TypeReference<Map<String, Object>>() {
        });

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);


        });
        System.out.println(map.get("age") instanceof Integer);

    }
}
