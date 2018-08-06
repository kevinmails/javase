package com.test.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/8/17
 *         Time 13:33
 */
public class TestPath {
    public static void main(String[] args) throws IOException {


        List<String> list = Files.readAllLines(Paths.get("D:\\finance-mect-jsfund.2017-06-05.log"));
        list.stream().filter((s) -> s.contains("DEBUG")).forEach(System.out::println);


    }
}
