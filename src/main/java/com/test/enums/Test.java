package com.test.enums;

/**
 * @author kevin.chen
 * Date 2023/5/30
 * Time 22:44
 */
public class Test {
    public static void main(String[] args) {


        System.out.println(AppErrCd.P.P003.getCode());
        System.out.println(AppErrCd.P.P003.getMsg());

        printError(AppErrCd.R.R002);


    }


    static void printError(AppErrCd errCd) {
        System.out.println(errCd.getCode());
        System.out.println(errCd.getMsg());


    }
}
