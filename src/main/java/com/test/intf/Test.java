package com.test.intf;

/**
 * @author 陈彬
 *         Date 2018/3/7
 *         Time 14:40
 */
public class Test {
    public static void main(String[] args) {

        Funds f = HuaXiaFunds::new;

        f.sub();
    }
}
