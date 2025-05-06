package com.test.generic;

/**
 * @author kevin.chen
 * Date 2024/7/16
 * Time 19:10
 */
public class Food {

    public void print(String name  ) {
        System.out.println("食品的名称："+name );
    }

    public void print(String name, int price  ) {
        System.out.println("食品的名称："+name );
    }

    public void print(int price, String name) {
        System.out.println("食品的名称："+name );
    }
}
