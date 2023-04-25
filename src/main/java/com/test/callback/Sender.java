package com.test.callback;

import lombok.Builder;
import lombok.Data;

/**
 * @author kevin.chen
 * Date 2023/4/25
 * Time 15:14
 * 邮寄快递的人
 */
@Data
@Builder
public class Sender {

    private String name;

    interface Receiver {

        /**
         * 邮寄快递的人，接收快递公司单号的回调方法
         *
         * @param order
         */
        void receiveOrder(String order);
    }

}
