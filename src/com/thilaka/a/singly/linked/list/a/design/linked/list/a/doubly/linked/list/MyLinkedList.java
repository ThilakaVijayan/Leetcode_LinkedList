package com.thilaka.a.singly.linked.list.a.design.linked.list.a.doubly.linked.list;

public class MyLinkedList {

    private int val;
    private MyLinkedList prev;
    private MyLinkedList next;
    private MyLinkedList head;

    public MyLinkedList() {
    }

    private MyLinkedList(int val) {
        this.val = val;
    }

    public int get(int index) {
        MyLinkedList currNode = this.head;
        if (currNode == null) {
            return -1;
        }
        for (int i = 0; i < index; i++) {
            if (currNode.next == null) {
                return -1;
            }
            currNode = currNode.next;
        }
        return currNode.val;
    }

    public void addAtHead(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        MyLinkedList head = this.head;
        newNode.next = head;
        head.prev = newNode;
        this.head = newNode;
    }

    public void addAtTail(int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        MyLinkedList currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList newNode = new MyLinkedList(val);
        if (this.head == null) {
            if (index == 0) {
                this.head = newNode;
            }
            return;
        } else if (index == 0) {
            addAtHead(val);
            return;
        }

        MyLinkedList currNode = this.head;
        for (int i = 0; i < index; i++) {
            if (currNode.next == null) {
                if (i == index - 1) {
                    addAtTail(val);
                }
                return;
            }
            currNode = currNode.next;
        }

        MyLinkedList prevNode = currNode.prev;
        currNode.prev = newNode;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = currNode;
    }

    public void deleteAtIndex(int index) {
        MyLinkedList currNode = this.head;
        if (currNode == null) {
            return;
        }
        if (index == 0) {
            this.head = currNode.next;
            return;
        }
        for (int i = 0; i < index; i++) {
            if (currNode.next == null) {
                return;
            }
            currNode = currNode.next;
        }
        MyLinkedList prevNode = currNode.prev;
        MyLinkedList nextNode = currNode.next;

        prevNode.next = nextNode;

        if (nextNode != null) {
            nextNode.prev = prevNode;
        }
    }

    @Override
    public String toString() {
        String outPut = String.valueOf(this.val);
        MyLinkedList currNode = this.head;
        if (currNode == null) {
            return outPut;
        }
        outPut = String.valueOf(currNode.val);
        while (currNode.next != null) {
            currNode = currNode.next;
            outPut = outPut + "->" + currNode.val;
        }
        return outPut;
    }
}
