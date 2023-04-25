package com.test.callback;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by KEVIN on 2016/11/26.
 * <p>
 * <p>
 * 匿名内部类的使用场景之回调
 * <p>
 * 模拟邮寄快递，回调通知收到订单号的处理
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        Express express = Express.builder().companyName("京东快速").build();

//        express.receiveExpress(new CallBack() {
//
//            @Override
//            public void returnOrder(String expressOrderNo) {
//                System.out.println("收到单号：" + expressOrderNo);
//            }
//        });

        Sender sender = Sender.builder().name("小明").build();
        express.receiveExpress(sender, expressOrder -> {
            log.info("{},取得快递单号:{}", sender.getName(), expressOrder);

            //跟据每个人的情况不同，做一些个性人化的事件
            log.info("{}把快递收了起来，结束了", sender.getName());
        });

        Sender xiaohong = Sender.builder().name("小红").build();
        express.receiveExpress(xiaohong, expressOrder -> {
            log.info("{},取得快递单号:{}", sender.getName(), expressOrder);
            log.info("{}把快递号转给妈妈，等快递到了让她去取！", sender.getName());
        });


//        express.receiveExpress(System.out::print);


    }

}
