package com.test.java8;

import lombok.extern.slf4j.Slf4j;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author kevin.chen
 * Date 2023/5/11
 * Time 11:02
 */
@Slf4j
public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        String formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(now);

        log.info(formatted);
        System.out.println(new Date());


    }
}
