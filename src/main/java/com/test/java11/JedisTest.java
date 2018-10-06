package com.test.java11;

import redis.clients.jedis.Jedis;

/**
 * @author 陈彬
 * Date 2018/9/19
 * Time 14:42
 */
public class JedisTest {

    public static void main(String[] args) {

        var jedis = new Jedis("imcbb.com",65379);
        jedis.auth("Rediss!!Pass010");
        jedis.setex("foo", 30, "test");
        String value = jedis.get("foo");
        jedis.incr("flag");
        long result = jedis.setnx("name", "kevin");
        jedis.del("name");
        System.out.println(result);

        System.out.println(value);
        System.out.println(jedis.get("flag"));


    }
}
