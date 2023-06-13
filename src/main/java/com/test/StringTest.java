package com.test;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

/**
 * @author kevin.chen
 * Date 2023/5/16
 * Time 20:29
 */
@Slf4j
public class StringTest {

    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = null;
        log.info("" + Strings.isNullOrEmpty(s1));
        log.info("" + Strings.isNullOrEmpty(s2));
        log.info("" + Strings.isNullOrEmpty(s3));

    }


}
