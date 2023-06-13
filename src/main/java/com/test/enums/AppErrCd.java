package com.test.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


public interface AppErrCd {

    @Getter
    @AllArgsConstructor
    enum P implements AppErrCd {
        P002("P002", "必填参数为空"),

        P003("P003", "输入参数非法");

        private final String code;
        private final String msg;
    }

    @Getter
    @AllArgsConstructor
    enum R implements AppErrCd {
        R002("R002", "调用下游RPC接口异常,下游接口Result为NULL"),

        R003("R003", "调用下游RPC接口异常,下游接口返回结果为空"),

        R004("R004", "调用下游RPC接口异常"),

        R005("R005", "调用下游RPC接口异常,下游接口响应超时");

        private final String code;
        private final String msg;
    }


    String getCode();

    String getMsg();

}
