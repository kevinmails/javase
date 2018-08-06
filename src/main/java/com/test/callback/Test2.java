package com.test.callback;

/**
 * @author 陈彬
 *         Date 2017/7/21
 *         Time 19:26
 */
public class Test2 {
    public static void main(String[] args) {

        Express express = new Express();
//        express.receiveExpress(new CallBack() {
//            @Override
//            public void returnOrder(String expressOrderNo) {
//                System.out.println("收到单号:" + expressOrderNo);
//            }
//        });

        express.receiveExpress(System.out::print);
        


    }
}
