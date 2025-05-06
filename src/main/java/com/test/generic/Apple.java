package com.test.generic;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 11:59
 */
public class  Apple extends Food implements Fruit{
    private String name;

    public Apple() {}

    public Apple(String name) {
        this.name = name;
    }

    @Override
    public void print(String name) {
        super.print(name);
    }

    public String print(Fruit f) {
        return f.toString();
    }
}
