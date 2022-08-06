package com.thilaka.a.singly.linked.list.a.design.linked.list.a.doubly.linked.list.third.attempt;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedList myList = new MyDoublyLinkedList();
        myList.addAtHead(1);
        myList.addAtTail(3);
        myList.addAtIndex(1,2);
        System.out.println(myList.get(1));
        myList.deleteAtIndex(1);
        System.out.println(myList.get(1));

        MyDoublyLinkedList myList2 = new MyDoublyLinkedList();
        myList2.addAtHead(4);
        System.out.println(myList2.get(1));
        myList2.addAtHead(1);
        myList2.addAtHead(5);
        myList2.deleteAtIndex(3);
        myList2.addAtHead(7);
        System.out.println(myList2.get(3));
        System.out.println(myList2.get(3));
        System.out.println(myList2.get(3));
        myList2.addAtHead(1);
        myList2.deleteAtIndex(4);

        MyDoublyLinkedList myList3 = new MyDoublyLinkedList();
        myList3.addAtHead(1);
        myList3.deleteAtIndex(0);

        MyDoublyLinkedList myList4 = new MyDoublyLinkedList();
        myList4.addAtHead(7);
        myList4.addAtHead(2);
        myList4.addAtHead(1);
        myList4.addAtIndex(3,0);
        myList4.deleteAtIndex(2);
        myList4.addAtHead(6);
        myList4.addAtTail(4);
        System.out.println(myList4.get(4));
        myList4.addAtHead(4);
        myList4.addAtIndex(5,0);
        myList4.addAtHead(6);
    }
}
