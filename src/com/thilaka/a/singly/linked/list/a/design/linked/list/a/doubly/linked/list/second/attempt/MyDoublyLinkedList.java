package com.thilaka.a.singly.linked.list.a.design.linked.list.a.doubly.linked.list.second.attempt;

import com.thilaka.a.singly.linked.list.a.design.linked.list.a.MyLinkedList;

public class MyDoublyLinkedList implements MyLinkedList {
    private DoublyListNode head;

    @Override
    public int get(int index) {
        DoublyListNode node = getNode(index);
        if (null == node)
            return -1;
        return node.getVal();
    }

    private DoublyListNode getNode(int index) {
        int currIndex = 0;
        DoublyListNode currNode = this.head;
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
        DoublyListNode currHead = this.head;
        DoublyListNode newNode = new DoublyListNode(val);
        newNode.setNext(currHead);
        if(null != currHead)
            currHead.setPrev(newNode);
        this.head = newNode;
    }

    @Override
    public void addAtTail(int val) {
        DoublyListNode currNode = this.head;
        if (null == currNode) {
            addAtHead(val);
            return;
        }

        while (null != currNode.getNext()) {
            currNode = currNode.getNext();
        }
        DoublyListNode newNode = new DoublyListNode(val);
        newNode.setPrev(currNode);
        currNode.setNext(newNode);
    }

    @Override
    public void addAtIndex(int index, int val) {
        if (0 == index) {
            addAtHead(val);
            return;
        }
        DoublyListNode prevNode = getNode(index - 1);
        if (null == prevNode)
            return;
        DoublyListNode nextNode = prevNode.getNext();
        DoublyListNode newNode = new DoublyListNode(val);
        prevNode.setNext(newNode);
        newNode.setNext(nextNode);
        if(null != nextNode)
            nextNode.setPrev(newNode);
        newNode.setPrev(prevNode);
    }

    @Override
    public void deleteAtIndex(int index) {
        if (0 == index) {
            deleteAtHead();
            return;
        }
        DoublyListNode prevNode = getNode(index - 1);
        if (null == prevNode)
            return;
        DoublyListNode currNode = prevNode.getNext();
        if (null == currNode)
            return;
        DoublyListNode nextNode = currNode.getNext();
        prevNode.setNext(nextNode);
        if(null != nextNode)
            nextNode.setPrev(prevNode);
    }

    private void deleteAtHead() {
        if (null == this.head || null == this.head.getNext()){
            this.head = null;
            return;
        }
        this.head = this.head.getNext();
        this.head.setPrev(null);
    }

    class DoublyListNode {
        private int val;
        private DoublyListNode next;
        private DoublyListNode prev;

        public DoublyListNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public DoublyListNode getNext() {
            return next;
        }

        public void setNext(DoublyListNode next) {
            this.next = next;
        }

        public DoublyListNode getPrev() {
            return prev;
        }

        public void setPrev(DoublyListNode prev) {
            this.prev = prev;
        }
    }
}
