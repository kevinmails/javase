package com.test.java8;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by KEVIN on 2016/11/30.
 */
public class Person {

    private Map.Entry<String, String> entry;

    private String name;
    private int age;
    private String nickname;

    private BigDecimal height;

    public Person() {
    }

    public Person(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        System.out.println(this.name + "&" + this.nickname);
    }

    public Person(String name, int age, BigDecimal height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Map.Entry<String, String> entry) {
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
