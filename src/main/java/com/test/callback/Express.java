package com.test.callback;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Created by KEVIN on 2016/11/26.
 */
@Slf4j
@Builder
@Data
public class Express {

    private String companyName;

    public void receiveExpress(Sender sender, Sender.Receiver receiver) {
        log.info("{}，收到来自邮寄人 {} 的快递", companyName, sender.getName());
        String expressOrder = UUID.randomUUID().toString();
        log.info("{}，生成单号:{}", companyName, expressOrder);
        receiver.receiveOrder(expressOrder);
    }

    public void printExpressNo(String expressNo) {
        System.out.println(expressNo);
    }


}
