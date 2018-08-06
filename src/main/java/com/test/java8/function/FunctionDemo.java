package com.test.java8.function;

import java.util.function.Function;

/**
 * @author 陈彬
 *         Date 2018/1/13
 *         Time 10:50
 */
public class FunctionDemo {

    static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function) {

        int newValue = function.apply(valueToBeOperated);

	        /*

	         * Do some operations using the new value.

	         */

        System.out.println(newValue);

    }
}
