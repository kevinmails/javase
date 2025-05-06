package com.test.java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kevin.chen
 * Date 2024/8/25
 * Time 23:14
 */
public class DateTest {
    public static final String DATE_TIME_PATTERN = "yyyyMMdd HH:mm:ss";

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime beginTime = LocalDateTime.parse("20250203 11:00:01", DateTimeFormatter.ofPattern("yyyyMMdd " +
                "HH:mm:ss"));
        System.out.println("beginTime"+beginTime);


        String newendStr = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));
        LocalDateTime bt = LocalDateTime.parse(newendStr, DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));

        /**
         * 因为LocalDateTime.now()带有毫秒时间，而我们的时间格式为"yyyyMMdd HH:mm:ss"，bt为同一秒钟的时间，这里比较会返回true,
         * 既当开始时间跟当前时间是同一秒钟会返回true，但是实际上应该返回false（未过期）。所以在比较时间时需要注意这个问题。
         */
        System.out.println("bt1" + bt);
        System.out.println("bt1" + now.isAfter(bt));

        Instant now1 = Instant.now();
        System.out.println(now1);





        System.out.println("过期了么：" + isExpired("20230203 11:00:01"));

    }


    /**
     * 判断食品是否过期
     * @param endTime
     * @return
     */
    public static  boolean isExpired(String endTime) {

        LocalDateTime end = LocalDateTime.parse(endTime, DateTimeFormatter.ofPattern("yyyyMMdd " +
                "HH:mm:ss"));

        LocalDateTime now = LocalDateTime.now();

        return now.isAfter(end);


    }


}
