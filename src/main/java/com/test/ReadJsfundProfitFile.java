package com.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by KEVIN on 2017/2/8.
 */
public class ReadJsfundProfitFile {
    public static void main(String[] args) {

        CommonReadFile();

    }

    public static void CommonReadFile() {
        Long begin = System.currentTimeMillis();
        File file = new File("D:\\0030001_user_profit_20161231_1.txt");
        LineIterator iterator = null;
        try {
            iterator = FileUtils.lineIterator(file, "GBK");
            int i = 0;
            BigDecimal decimal = BigDecimal.ZERO;
            while (iterator.hasNext()) {
                String line = iterator.nextLine();
                if (i < 2) {
                    i++;
                    continue;
                }

                String[] arr = line.split("\\|");
                decimal = decimal.add(new BigDecimal(arr[6]));
            }
            System.out.println(decimal);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != iterator) {
                LineIterator.closeQuietly(iterator);
            }
        }

        Long end = System.currentTimeMillis();
        Long used = (end - begin) / 1000;
        System.out.println("used second=" + used);
    }

}
