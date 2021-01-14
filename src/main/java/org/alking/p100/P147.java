package org.alking.p100;

import org.alking.common.ListNode;

public class P147 {

    public ListNode insertionSortList(ListNode head) {
        ListNode h = null;
        ListNode tail = null;
        while (head != null) {
            ListNode node = head;
            head = head.next;
            if (tail == null) {
                node.next = null;
                h = node;
                tail = node;
                continue;
            }
            if (node.val < h.val) {
                node.next = h;
                h = node;
            } else if (node.val >= tail.val) {
                tail.next = node;
                tail = node;
                tail.next = null;
            } else {
                ListNode p = h;
                while (p.next != null && node.val > p.next.val) {
                    p = p.next;
                }
                node.next = p.next;
                p.next = node;
            }
        }
        return h;
    }
}
