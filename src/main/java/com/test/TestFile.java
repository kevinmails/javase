package com.test;

import com.sun.management.OperatingSystemMXBean;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by KEVIN on 2016/1/11.
 */
public class TestFile {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        Scanner scanner = null;
/*        StringBuffer sb = new StringBuffer();
        OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        sb.append("ϵͳ�����ڴ��ܼƣ�").append(osmb.getTotalPhysicalMemorySize() / 1024 / 1024).append("MB");
        sb.append("ϵͳ��������ڴ��ܼƣ�").append(osmb.getFreePhysicalMemorySize() / 1024 / 1024).append("MB");
        System.out.println(sb.toString());*/
        long curr = System.currentTimeMillis();
        try {
            int i = 0;
            File file = new File("d:\\0030001_user_profit_20160111_1.txt");
            System.out.println(file.length());
            inputStream = new FileInputStream(file);
            scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                i = ++i;
                System.out.println(i + "-" + s);
            }
            System.out.println((System.currentTimeMillis()-curr)/1000);
            TestFile.displayAvailableMemory();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != scanner) {
                scanner.close();
            }
        }


    }


    public static void displayAvailableMemory() {
        Runtime run = Runtime.getRuntime();

        long max = run.maxMemory() / 1024 / 1024;

        long total = run.totalMemory() / 1024 / 1024;

        long free = run.freeMemory() / 1024 / 1024;

        long usable = max - total + free;

        System.out.println("����ڴ� = " + max);
        System.out.println("�ѷ����ڴ� = " + total);
        System.out.println("�ѷ����ڴ��е�ʣ��ռ� = " + free);
        System.out.println("�������ڴ� = " + usable);
    }

}
