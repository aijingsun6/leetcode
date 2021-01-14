package org.alking.offer;

import org.alking.common.ListNode;

public class O24 {

    public ListNode reverseList(ListNode head) {
        ListNode h = null;
        ListNode t = null;
        while (head != null) {
            t = head.next;
            if (h == null) {
                h = head;
                h.next = null;
            } else {
                head.next = h;
                h = head;
            }
            head = t;
        }
        return h;
    }
}
