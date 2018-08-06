package com.test;

import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by KEVIN on 2016/1/22.
 */
public class RiskControlUtil {

    private static int IPHONE_LENGTH = 11;

    private RiskControlUtil() {
    }


    public static String AccountDesensitize(String phone) throws Exception {
        if (null == phone || phone.length() == 0) {
            return phone;
        }
        if (!isPhoneNo(phone)) {
            throw new Exception("手机号格式非法");
        }
        return phone.replace(phone.substring(4, 8), "****");
    }

    private static boolean isPhoneNo(String msg) {
        Pattern p = Pattern.compile("[1][0-9]{10}");
        Matcher m = p.matcher(msg);
        return m.matches();
    }


    public static void main(String[] args) {
        try {
            System.out.println(RiskControlUtil.AccountDesensitize("47721111626"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
