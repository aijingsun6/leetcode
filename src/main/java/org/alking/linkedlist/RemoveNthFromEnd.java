package org.alking.linkedlist;

import org.alking.common.ListNode;

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        // forward p1
        int acc = 0;
        for (int i = 0; i < n; i++) {
            if (p1.next != null) {
                p1 = p1.next;
                acc++;
            } else {
                break;
            }
        }

        if (acc < n - 1) {
            return head;
        }
        if (acc < n) {
            // acc = n - 1
            return head.next;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;
        return head;
    }


}
