package com.test.trace;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by KEVIN on 2017/5/21.
 */
public class TraceContext {

    public static final HashMap<String, ThreadLocal> TRACER_MAP = new HashMap<String, ThreadLocal>();

    public static String getTraceId() {
        String threadId = String.valueOf(Thread.currentThread().getId());
        ThreadLocal<Tracer> local = TRACER_MAP.get(threadId);
        if (null == local) {
            local = new ThreadLocal();
            local.set(new Tracer(createTraceId()));
            TRACER_MAP.put(threadId, local);
        }
        return local.get().getTraceId();
    }


    private static String createTraceId() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public static void removeThread() {
        String threadId = String.valueOf(Thread.currentThread().getId());
        TRACER_MAP.remove(threadId);
    }

}
