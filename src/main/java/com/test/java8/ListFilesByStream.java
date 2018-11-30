package com.test.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author kevin
 * Date 2018/11/30
 * Time 14:19
 * 打印目录树
 */
public class ListFilesByStream {

    public static void main(String[] args) {

        Path source = Paths.get("D:\\JDK8");
        try {
            Files.walk(source).filter(Files::isRegularFile).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
