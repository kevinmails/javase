package com.test.serialization;

import com.test.serialization.Human;

import java.io.Serializable;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 17:27
 */
public class Person implements Human {

   // private static final long serialVersionUID = -6019857131461208727L;



    private String name;

    private int age;
    private String abc;
    private VersionEnum versionEnum;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", abc='" + abc + '\'' +
                ", versionEnum=" + versionEnum +
                '}';
    }

    @Override
    public void sayHello() {

        System.out.println("hello!");

    }

    public VersionEnum getVersionEnum() {
        return versionEnum;
    }

    public Person setVersionEnum(VersionEnum versionEnum) {
        this.versionEnum = versionEnum;
        return this;
    }
}
