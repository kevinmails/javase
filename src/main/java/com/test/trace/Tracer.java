package com.test.trace;

/**
 * Created by KEVIN on 2017/5/21.
 */
public class Tracer {
    private String traceId;

    public Tracer(String traceId) {
        this.traceId = traceId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
