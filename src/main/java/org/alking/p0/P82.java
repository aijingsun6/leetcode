package org.alking.p0;

import org.alking.common.ListNode;

public class P82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dum = new ListNode(0);
        ListNode tail = null;
        ListNode h = head;
        while (h != null) {
            ListNode t = h;
            int v = h.val;
            int c = 1;
            while (true) {
                h = h.next;
                if(h == null){
                    break;
                }
                if (h.val == v) {
                    c++;
                } else {
                    break;
                }
            }
            if (c < 2) {
                if (tail == null) {
                    dum.next = t;
                } else {
                    tail.next = t;
                }
                tail = t;
            }
        }
        if (tail != null) {
            tail.next = null;
        }
        return dum.next;
    }
}
