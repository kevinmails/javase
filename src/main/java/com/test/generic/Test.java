package com.test.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 12:03
 */
public class Test {
    public static void main(String[] args) {

        Plate<Fruit> plate = new Plate<>();

        plate.put(new Apple());
        Fruit fruit = plate.get();

        List<? extends Fruit>  list = new ArrayList<>();


    }
}
