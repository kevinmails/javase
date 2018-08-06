package com.test.java8;

import java.math.BigDecimal;

/**
 * @author 陈彬
 *         Date 2017/8/18
 *         Time 19:52
 */
public class SortableBean {

    private String code;

    private BigDecimal amt ;

    private String recommend;

    private int age;

    public SortableBean(BigDecimal amt, String recommend) {
        this.amt = amt;
        this.recommend = recommend;
    }

    public SortableBean(String code, BigDecimal amt, String recommend, int age) {
        this.code = code;
        this.amt = amt;
        this.recommend = recommend;
        this.age = age;
    }

    public SortableBean(String code, BigDecimal amt, String recommend) {
        this.code = code;
        this.amt = amt;
        this.recommend = recommend;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SortableBean{" +
                "code='" + code + '\'' +
                ", amt=" + amt +
                ", recommend='" + recommend + '\'' +
                ", age=" + age +
                '}';
    }
}
