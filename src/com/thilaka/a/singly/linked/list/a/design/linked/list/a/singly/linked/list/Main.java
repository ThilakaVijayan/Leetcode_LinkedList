package com.thilaka.a.singly.linked.list.a.design.linked.list.a.singly.linked.list;

public class Main {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();
        myList.addAtHead(1);
        myList.addAtTail(3);
        myList.addAtIndex(1, 2);
        System.out.println(myList.get(1));
        myList.deleteAtIndex(1);
        System.out.println(myList.get(1));

        MySinglyLinkedList myList2 = new MySinglyLinkedList();
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
    }
}
