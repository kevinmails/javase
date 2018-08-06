package com.test.generic;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 12:00
 */
public class Plate<T extends Fruit> {

    private T item;

    public void put(T item) {
        this.item = item;

    }

    public T get() {
        return this.item;
    }

}
