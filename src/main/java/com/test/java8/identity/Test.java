package com.test.java8.identity;

/**
 * @author 陈彬
 * Date 2018/9/5
 * Time 10:52
 */
public class Test {
    public static void main(String[] args) {


        IdentityCard card = IdentityCardUtil.extIdentityInfo("130724198108204342");

        System.out.println(card.toString());
        System.out.println(card.getSex().getCode());


    }
}
