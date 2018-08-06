package com.test.java8;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by KEVIN on 2016/11/30.
 */
public class Test {

    public static void main(String[] args) {

        List<Person> std = new ArrayList();
        std.add(new Person("kevin", 20));
        std.add(new Person("jim", 10));
        std.add(new Person("xiaoming", 20));
        std.add(new Person("java", 17));
        std.add(new Person("abc", 20));

        std = std.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());
        std.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(ToStringBuilder.reflectionToString(person));
        });

        Path path = Paths.get("D:\\bestpay");

        try {
            Iterator<Path> pathIterator = Files.list(path).iterator();
            while (pathIterator.hasNext()) {
                Path p = pathIterator.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
