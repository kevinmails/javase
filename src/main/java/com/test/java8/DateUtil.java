package com.test.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtil {

    public static final String DATE_TIME_PATTERN = "yyyyMMddHHmmss";

    private static  final SimpleDateFormat f = new SimpleDateFormat(DATE_TIME_PATTERN);


    public static Date getCurrentDatetime(String v) throws ParseException {

       return f.parse(v);

    }




}
