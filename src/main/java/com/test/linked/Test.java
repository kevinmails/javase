package com.test.linked;

public class Test {

    public static void main(String[] args) {


        MyLinkedList<Integer>  myLinkedList = new MyLinkedList<>();

            myLinkedList.add(12);
            myLinkedList.add(30);


        System.out.println(myLinkedList.get(1));

    }
}
