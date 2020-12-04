package com.basic.sample.ex2;

import common.Exercise;

public class MyLinkedListExample implements Exercise {

    public void start() {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(2, 8);
        ll.printList();
    }
}
