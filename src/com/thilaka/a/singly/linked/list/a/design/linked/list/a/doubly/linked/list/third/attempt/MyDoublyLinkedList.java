package com.thilaka.a.singly.linked.list.a.design.linked.list.a.doubly.linked.list.third.attempt;

import com.thilaka.a.singly.linked.list.a.design.linked.list.a.MyLinkedList;

public class MyDoublyLinkedList implements MyLinkedList {
    private DoublyListNode head;
    private DoublyListNode tail;
    private int lenght;

    @Override
    public int get(int index) {
        DoublyListNode node = getNode(index);
        if (null == node)
            return -1;
        return node.getVal();
    }

    private DoublyListNode getNode(int index) {
        if(index > this.lenght -1)
            return null;
        if (isInFirstHalf(index)) {
            DoublyListNode currNode = this.head;
            for(int currIndex = 0; index != currIndex; currIndex++)
                currNode = currNode.getNext();
            return currNode;
        } else {

            DoublyListNode currNode = this.tail;
            for(int currIndex = this.lenght - 1;index != currIndex;currIndex--)
                currNode = currNode.getPrev();
            return currNode;
        }
    }

    @Override
    public void addAtHead(int val) {
        DoublyListNode currHead = this.head;
        DoublyListNode newNode = new DoublyListNode(val);
        newNode.setNext(currHead);
        if (null == currHead)
            this.tail = newNode;
        else
            currHead.setPrev(newNode);
        this.head = newNode;
        this.lenght++;
    }

    @Override
    public void addAtTail(int val) {
        DoublyListNode currTail = this.tail;
        DoublyListNode newNode = new DoublyListNode(val);
        newNode.setPrev(currTail);
        if (null == currTail)
            this.head = newNode;
        else
            currTail.setNext(newNode);
        this.tail = newNode;
        this.lenght++;
    }

    @Override
    public void addAtIndex(int index, int val) {
        if(index > this.lenght)
            return;
        if (0 == index) {
            addAtHead(val);
            return;
        } else if (this.lenght == index) {
            addAtTail(val);
            return;
        }
        DoublyListNode prevNode = getNode(index - 1);
        DoublyListNode nextNode = prevNode.getNext();
        DoublyListNode newNode = new DoublyListNode(val);
        prevNode.setNext(newNode);
        newNode.setNext(nextNode);
        if (null == nextNode)
            this.tail = newNode;
        else
            nextNode.setPrev(newNode);
        newNode.setPrev(prevNode);
        this.lenght++;
    }

    @Override
    public void deleteAtIndex(int index) {
        if(index > this.lenght -1)
            return;
        if (0 == index) {
            deleteAtHead();
            return;
        } else if (this.lenght - 1 == index) {
            deleteAtTail();
            return;
        }
        DoublyListNode prevNode = getNode(index - 1);
        DoublyListNode currNode = prevNode.getNext();
        DoublyListNode nextNode = currNode.getNext();
        prevNode.setNext(nextNode);
        if (null == nextNode)
            this.tail = prevNode;
        else
            nextNode.setPrev(prevNode);
        this.lenght--;
    }

    private void deleteAtHead() {
        if(0 == this.lenght)
            return;

        if (1 == this.lenght) {
            this.head = null;
            this.tail = null;
            this.lenght = 0;
            return;
        }
        this.head = this.head.getNext();
        this.head.setPrev(null);
        this.lenght--;
    }

    private void deleteAtTail() {
        if(0 == this.lenght)
            return;

        if (1 == this.lenght) {
            this.tail = null;
            this.head = null;
            this.lenght = 0;
            return;
        }
        this.tail = this.tail.getPrev();
        this.tail.setNext(null);
        this.lenght--;
    }

    private boolean isInFirstHalf(int index) {
        return index <= this.lenght / 2;
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
