package com.test;

import java.io.*;
import java.math.BigDecimal;

/**
 * Created by KEVIN on 2016/4/5.
 */
public class BigDec {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(20);
        System.out.println(BigDecimal.TEN);

        TestObj obj = new TestObj();
        obj.setDec(bigDecimal);

        System.out.println(obj.getDec().toString());

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\MyObj"));
            out.writeObject(obj);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\MyObj"));
            TestObj o = (TestObj)in.readObject();

            System.out.println(o.getDec().toString());




        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
