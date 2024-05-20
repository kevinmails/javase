package com.test.ulid;

import io.azam.ulidj.MonotonicULID;
import io.azam.ulidj.ULID;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author kevin.chen
 * Date 2024/5/17
 * Time 23:06
 */
public class Test {

    public static void main(String[] args) {

        String monotonicULID = ULIDUtil.monotonicULID();
        System.out.println(monotonicULID);
        String ulid = ULIDUtil.ulid();
        System.out.println(ulid);
        System.out.println(ULIDUtil.getTimestamp(ulid));

        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ULIDUtil.getTimestamp(ulid)), ZoneId.systemDefault());
        System.out.println(localDateTime);

    }
}
