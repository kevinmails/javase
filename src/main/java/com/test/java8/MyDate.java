package com.test.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

/**
 * Created by KEVIN on 2017/6/26.
 */
public class MyDate {

    public static void main(String[] args) {

        String now = LocalDate.now().minusDays(2).format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(now);




    }
}
