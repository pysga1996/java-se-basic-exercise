package com.basic.thuc_hanh.trien_khai_lop_LinkedList_don_gian.src.com.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(2,8);
        ll.printList();
    }
}
