package com.test.java8;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @author kevin.chen
 * Date 2023/6/13
 * Time 15:32
 */
public class PidTest {
    public static void main(String[] args) {

        System.out.println(getPid());
    }


    public static Long getPid() {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName();
        System.out.println(name);
        System.out.println( runtime.getStartTime());
        return Long.parseLong(name.substring(0, name.indexOf('@')));
//        return Integer.parseInt(name.substring(0, name.indexOf('@')));
    }
}
