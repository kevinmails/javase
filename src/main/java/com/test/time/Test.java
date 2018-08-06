package com.test.time;

import org.apache.commons.lang.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by KEVIN on 2017/4/16.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(new Date());

        Date date = getBeforeOneMinuteDateTime(1);
        System.out.println(date);


        try {
            Date p = parseDateTime("20170415150000");

            System.out.println(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Date getBeforeOneMinuteDateTime(int minutes) {
        Calendar calendar = Calendar.getInstance(Locale.CHINESE);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();

    }



    /**
     * yyyyMMddHHmmss
     */
    public static Date parseDateTime(String source) throws Exception {
        if (StringUtils.isNotEmpty(source)) {
            source = StringUtils.rightPad(source, 14, '0');
            return new SimpleDateFormat("yyyyMMddHHmmss").parse(source);
        }
        return null;
    }
}
