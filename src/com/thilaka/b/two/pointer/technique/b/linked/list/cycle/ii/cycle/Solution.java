package com.thilaka.b.two.pointer.technique.b.linked.list.cycle.ii.cycle;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode currNode = head;
        ListNode fastNode = currNode.next!=null?currNode.next.next:null;

        while(fastNode!=null){
            if(currNode==fastNode){
                return currNode;
            }
            currNode = currNode.next;
            fastNode = fastNode.next!=null?fastNode.next.next:null;
        }
        return null;
    }
}
