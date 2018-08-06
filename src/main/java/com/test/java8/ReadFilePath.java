package com.test.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author 陈彬
 *         Date 2017/11/13
 *         Time 10:55
 */
public class ReadFilePath {
    public static void main(String[] args) {

        try {
            Files.list(Paths.get("D:\\南京割接")).forEach(path -> {



            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
