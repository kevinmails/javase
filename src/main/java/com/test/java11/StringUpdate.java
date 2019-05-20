package com.test.java11;

/**
 * @author 陈彬
 * Date 2018/10/6
 * Time 16:01
 */
public class StringUpdate {
    public static void main(String[] args) {

        var string = "foo bar ";
        var repeatedString = string.repeat(3);
        System.out.println(repeatedString);

        boolean isBlankStr = "  a  ".isBlank();
        System.out.println(isBlankStr);




    }
}
