package org.alking.p0;

import org.alking.common.ListNode;

public class P92 {


    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode h = null;
        ListNode t = null;
        ListNode dummy = new ListNode(0);
        ListNode tail = null;
        int idx = 1;
        ListNode tmp;
        while (head != null && idx <= n){
            tmp = head.next;
            if(idx < m){
                if(tail == null){
                    dummy.next = head;
                }else {
                    tail.next = head;
                }
                tail = head;
            }else{
                // idx <= n
                if(h == null){
                    h = head;
                    t = head;
                }else {
                    head.next = h;
                    h = head;
                }
            }
            head = tmp;
            idx += 1;
        }
        if(tail == null){
            dummy.next = h;
        }
        if(h == null){
            return dummy.next;
        }
        if(tail != null){
            tail.next = h;
        }
        t.next = head;
        return dummy.next;
    }
}
