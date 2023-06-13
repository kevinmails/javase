package com.test.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 17:28
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p = new Person("a", 10);
        p.setVersionEnum(VersionEnum.V1);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.obj"));

        oos.writeObject(p);
        oos.close();


        //  反序列化

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.obj"));
        Person p2 = (Person) ois.readObject();
        System.out.println(p2);

        List<String> list = new ArrayList<>();
        list.add(null);
        System.out.println(list.size());

        list.forEach(System.out::println);


    }
}
