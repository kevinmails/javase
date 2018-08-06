package com.test.trace;

/**
 * Created by KEVIN on 2017/5/21.
 */
public class TraceUser {

    private String name;

    public TraceUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getUp() {

        log(" is time to get up!");
    }

    public void brushTooth() {
        log(" is time to brush your tooth!");
    }

    public void eatBreakfast() {

        log(" is time to eat breakfast!");
    }


    private void log(String str) {
        System.out.println("threadId:" + Thread.currentThread().getId() + ";traceId:" + TraceContext2.getTraceId() + ";" + this.name + str);
    }
}
