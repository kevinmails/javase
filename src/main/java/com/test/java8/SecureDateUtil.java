package com.test.java8;

import org.apache.commons.lang.time.FastDateFormat;

import java.util.Date;

/**
 * @author kevin
 */
public class SecureDateUtil {
    public static final String DATE_TIME_PATTERN = "yyyyMMddHHmmss";



    private static FastDateFormat format = FastDateFormat.getInstance(DATE_TIME_PATTERN);


    public static String getCurrentDateTime(){
       return format.format(new Date());
    }







}
