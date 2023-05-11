package com.test;

/**
 * @author kevin.chen
 * Date 2023/5/9
 * Time 22:46
 * java 的标签语法
 */
public class LabelTest {
    public static void main(String[] args) {

        int i = 0;
        label1:
        for (; ; ) {
            inner1:
            for (; i < 10; i++) {
                System.out.println("i=" + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
//                    break; //不回跳出第一层的无限循环
                    break label1;
                }
            }

        }


    }
}
