package com.thilaka.a.singly.linked.list.a.design.linked.list.a.singly.linked.list;

import com.thilaka.a.singly.linked.list.a.design.linked.list.a.MyLinkedList;

public class MySinglyLinkedList implements MyLinkedList {
    private SinglyListNode head;

    @Override
    public int get(int index) {
        SinglyListNode node = getNode(index);
        if(null == node)
            return -1;
        return node.getVal();
    }

    private SinglyListNode getNode(int index) {
        int currIndex = 0;
        SinglyListNode currNode = this.head;
        while (index != currIndex && null != currNode) {
            currNode = currNode.getNext();
            currIndex++;
        }
        if (null == currNode)
            return null;
        return currNode;
    }

    @Override
    public void addAtHead(int val) {
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    @Override
    public void addAtTail(int val) {
        SinglyListNode currNode = this.head;
        if (null == currNode) {
            addAtHead(val);
            return;
        }

        while (null != currNode.getNext()) {
            currNode = currNode.getNext();
        }
        SinglyListNode newNode = new SinglyListNode(val);
        currNode.setNext(newNode);
    }

    @Override
    public void addAtIndex(int index, int val) {
        if (0 == index) {
            addAtHead(val);
            return;
        }
        SinglyListNode prevNode = getNode(index - 1);
        if(null == prevNode)
            return;
        SinglyListNode nextNode = prevNode.getNext();
        SinglyListNode newNode = new SinglyListNode(val);
        prevNode.setNext(newNode);
        newNode.setNext(nextNode);
    }

    @Override
    public void deleteAtIndex(int index) {
        if (0 == index) {
            deleteAtHead();
            return;
        }
        SinglyListNode prevNode = getNode(index - 1);
        if(null == prevNode)
            return;
        SinglyListNode currNode = prevNode.getNext();
        if (null == currNode)
            return;
        SinglyListNode nextNode = currNode.getNext();
        prevNode.setNext(nextNode);
    }

    private void deleteAtHead() {
        if (null == this.head)
            return;
        this.head = this.head.getNext();
    }

    class SinglyListNode {
        private int val;
        private SinglyListNode next;

        public SinglyListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public SinglyListNode getNext() {
            return next;
        }

        public void setNext(SinglyListNode next) {
            this.next = next;
        }
    }
}
