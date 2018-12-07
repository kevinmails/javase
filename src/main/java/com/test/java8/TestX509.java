package com.test.java8;

import javax.net.ssl.KeyManagerFactory;
import java.security.Security;

/**
 * @author 陈彬
 * Date 2018/11/27
 * Time 14:42
 */
public class TestX509 {
    public static void main(String[] args) {

        String defaultKeyAlgorithm = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        String defaultTrustKeyAlgorithm = Security.getProperty("ssl.TrustManagerFactory.algorithm");

        System.out.println(defaultKeyAlgorithm);
        System.out.println(defaultTrustKeyAlgorithm);


    }
}
