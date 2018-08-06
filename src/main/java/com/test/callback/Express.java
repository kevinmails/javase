package com.test.callback;

import java.util.UUID;

/**
 * Created by KEVIN on 2016/11/26.
 */
public class Express {

    public void receiveExpress(CallBack back) {
        System.out.println("收快递。。。");
        String orderNo = UUID.randomUUID().toString();
        System.out.println("生成单号:" + orderNo);
        back.returnOrder(orderNo);
    }

    public void printExpressNo(String expressNo) {
        System.out.println(expressNo);
    }


}
