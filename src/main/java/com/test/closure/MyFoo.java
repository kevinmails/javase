package com.test.closure;

/**
 * @author kevin.chen
 * Date 2023/4/25
 * Time 10:16
 * <p>
 * 内部类
 */
public class MyFoo {

    private String fooStr = "fooStr";

    class InnerFoo<T> implements Foo<T> {

//        fooStr = "abc";

        @Override
        public void test(T str) {
            System.out.println("InnerFoo:" + str + fooStr);
        }
    }

    @FunctionalInterface
    interface Foo<T> {
        void test(T str);
    }


}
