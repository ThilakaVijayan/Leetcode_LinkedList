package com.thilaka.a.singly.linked.list.a.design.linked.list.a;

public interface MyLinkedList {
    int get(int index);
    void addAtHead(int val);
    void addAtTail(int val);
    void addAtIndex(int index, int val);
    void deleteAtIndex(int index);
}
