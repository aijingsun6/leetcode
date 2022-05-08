package org.alking.p200;

import org.alking.common.ListNode;

public class P203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode tail = null;
        ListNode n = head;
        while (n != null) {
            if(n.val != val){
                if(tail == null){
                    dummy.next  = n;
                }else {
                    tail.next = n;
                }
                tail = n;
            }
            n = n.next;
        }
        if(tail != null){
            tail.next = null;
        }
        return dummy.next;

    }
}
