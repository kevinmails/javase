package com.test.trace;

import java.util.UUID;

/**
 * Created by KEVIN on 2017/5/21.
 */

public class TraceContext2 {

    static ThreadLocal<Tracer> local = new ThreadLocal();

    static String getTraceId() {
        if (null == local) {
            local = new ThreadLocal();
            local.set(new Tracer(createTraceId()));
        } else if (null == local.get()) {
            local.set(new Tracer(createTraceId()));
        }
        return local.get().getTraceId();
    }


    static String createTraceId() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    /**
     * 移除ThreadLocal的存储的值
     */
    public static void removeTracer() {
        if (null != local) {
            local.remove();
        }
    }

}
