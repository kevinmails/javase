package com.test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by KEVIN on 2016/3/11.
 */
public class ReadFile {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(10000);
//        GuavaReadFile();
        CommonReadFile();
        Thread.sleep(80000);
    }


    public static void GuavaReadFile() {
        File file = new File("D:\\0030001_user_profit_20160421_1.txt");
        try {
            List<String> lines = Files.readLines(file, Charsets.UTF_8);
            for (String s : lines) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void ReadFile(){

        File file = new File("D:\\jsfund_redeem_20160516.txt.md5");
        try {
            String lines = Files.readFirstLine(file,Charsets.UTF_8);
            System.out.println(lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void CommonReadFile() {
        Long begin = System.currentTimeMillis();
        File file = new File("D:\\0030001_user_profit_20160421_1.txt");
        LineIterator iterator = null;
        try {
            iterator = FileUtils.lineIterator(file, "GBK");
            while (iterator.hasNext()) {
                String line = iterator.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != iterator) {
                LineIterator.closeQuietly(iterator);
            }
        }

        Long end = System.currentTimeMillis();
        Long used = (end - begin) / 1000;
        System.out.println("used=" + used);
    }
}
