package com.test.java8;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author 陈彬
 *         Date 2017/11/12
 *         Time 17:39
 */
public class ReadFileLines {
    public static void main(String[] args) {


        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\KEVIN\\Desktop\\bestpay_hifas_holdpercent_20170419.txt"))) {
            stream.onClose(() -> System.out.println("Closed"));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Charset.forName("GBK").name());

    }
}
