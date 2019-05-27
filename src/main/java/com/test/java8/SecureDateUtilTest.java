package com.test.java8;

import org.apache.commons.lang.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kevin
 */
public class SecureDateUtilTest {
    public static void main(String[] args) {


        System.out.println(SecureDateUtil.getCurrentDateTime());

        ExecutorService executorService = Executors.newFixedThreadPool(1000);


        for (int i = 0; i < 1000; i++) {

            executorService.submit(() -> {


//                    try {
//                        System.out.println(DateUtil.getCurrentDatetime("20180120191020"));
//                    } catch (ParseException e) {
//                        e.printStackTrace();
//                    }

                System.out.println(SecureDateUtil.getCurrentDateTime());

            });

        }

        executorService.shutdown();


    }


}
