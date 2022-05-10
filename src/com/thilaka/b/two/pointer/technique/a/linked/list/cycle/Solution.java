package com.thilaka.b.two.pointer.technique.a.linked.list.cycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode currNode = head;
        ListNode fastNode = currNode.next!=null?currNode.next.next:null;

        while(currNode.next!=null && fastNode!=null){
            if(currNode==fastNode){
                return true;
            }
            currNode = currNode.next;
            fastNode = fastNode.next!=null?fastNode.next.next:null;
        }
        return false;
    }
}
