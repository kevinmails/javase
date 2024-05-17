package com.test.ulid;

import io.azam.ulidj.MonotonicULID;
import io.azam.ulidj.ULID;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.infra.Blackhole;

/**
 * @author kevin.chen
 * Date 2024/5/17
 * Time 23:06
 */
public class Test {

    public static void main(String[] args) {

        String monotonicULID = ULIDUtil.monotonicULID();
        System.out.println(monotonicULID);

        System.out.println(ULIDUtil.getTimestamp(monotonicULID));

    }
}
