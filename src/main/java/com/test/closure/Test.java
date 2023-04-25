package com.test.closure;

import lombok.var;

import static java.lang.System.*;

/**
 * @author kevin.chen
 * Date 2023/4/25
 * Time 10:25
 * <p>
 * lambda表达式就是一个匿名内部类，一个闭包
 */
public class Test {

    public static void main(String[] args) {

        new MyFoo().new InnerFoo().test("haha");

         var s1 = "super s1";
        /**
         * 闭包
         */
        //            String s1 = "s1";
        MyFoo.Foo foo = new MyFoo.Foo() {
            @Override
            public void test(Object str) {
                out.println("foo:" + str);
                out.println(s1);
            }
        };

        foo.test("kevin");

        MyFoo.Foo<String> foo1 = (String str) -> out.println("test:" + str);
        foo1.test("kevin1");
        MyFoo.Foo<String> foo2 = (str) -> out.println("test:" + str);
        MyFoo.Foo<String> foo3 = str -> out.println("test:" + str);



    }
}
