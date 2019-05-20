package com.test.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author kevin.chen
 * Date 2019/2/20
 * Time 11:10
 */
public class InstantTest {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        //business code
        Thread.sleep(1000);

        long over = System.currentTimeMillis();

        System.out.println("business used " + (over - start) + " ms");


        Instant now = Instant.now();

        //business code
        Thread.sleep(2000);

        long used = ChronoUnit.MILLIS.between(now, Instant.now());

        //或者
        //long used =now.until(Instant.now(), ChronoUnit.MILLIS)

        System.out.println("business used " + used + " ms");

        System.out.println(now.until(Instant.now(), ChronoUnit.MILLIS));
        System.out.println(LocalDateTime.now());


    }
}
