package com.test.linked;

public class MyLinkedList<E> {

   private   Node<E> head = new Node<>(null);

    class Node<E> {
        E item;
        Node<E>  next;
        Node(E e) {
            item = e;
        }
    }


    public void add(E e) {

        Node<E> temp = head;
        while (temp.next != null){
             temp = temp.next;
        }
        temp.next = new Node<>(e);

    }

    public E get(int idx){


        Node<E> temp = head.next;

        for (int i = 0; i <idx ; i++) {

            temp = temp.next;

        }
        return temp.item;


    }






}
