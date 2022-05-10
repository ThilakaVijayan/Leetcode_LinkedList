package com.thilaka.a.singly.linked.list.a.design.linked.list.a.doubly.linked.list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        obj.deleteAtIndex(1);
        System.out.println(obj.toString());

        MyLinkedList obj1 = new MyLinkedList();
        obj1.addAtHead(1);
        obj1.deleteAtIndex(0);
        System.out.println(obj1.toString());

        MyLinkedList obj2 = new MyLinkedList();
        obj2.addAtHead(7);
        obj2.addAtHead(2);
        obj2.addAtHead(1);
        obj2.addAtIndex(3, 0);
        obj2.deleteAtIndex(2);
        obj2.addAtHead(6);
        obj2.addAtTail(4);
        System.out.println(obj2.get(4));
        obj2.addAtHead(4);
        obj2.addAtIndex(5, 0);
        obj2.addAtHead(6);
        obj2.deleteAtIndex(1);
        System.out.println(obj2.toString());

        MyLinkedList obj3 = new MyLinkedList();
        obj3.addAtHead(1);
        obj3.addAtTail(3);
        obj3.addAtIndex(1,2);
        System.out.println(obj3.get(1));
        obj3.deleteAtIndex(1);
        System.out.println(obj3.get(1));

       MyLinkedList obj4 = new MyLinkedList();
       obj4.addAtHead(1);
        obj4.addAtHead(1);
        obj4.addAtHead(1);
        obj4.deleteAtIndex(2);
        obj4.deleteAtIndex(1);
        obj4.deleteAtIndex(0);
        System.out.println(obj4.get(0));

        MyLinkedList obj5 = new MyLinkedList();
        obj5.addAtIndex(0,10);
        obj5.addAtIndex(0,20);
        obj5.addAtIndex(1,30);
        System.out.println(obj5.get(0));

        MyLinkedList obj6 = new MyLinkedList();
        obj6.addAtIndex(1,0);
        System.out.println(obj6.get(0));

    }
}
