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

<<<<<<< HEAD
        boolean isBlankStr = " abaddd ".isBlank();
=======
        boolean isBlankStr = " abadd ".isBlank();
>>>>>>> 4703081205b7dcc50f248d0507ca837daa924283
        System.out.println(isBlankStr);




    }
}
