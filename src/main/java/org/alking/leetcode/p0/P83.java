package org.alking.leetcode.p0;

import org.alking.leetcode.common.ListNode;

public class P83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode h = null;
        ListNode tail = null;
        while (head != null) {
            if (tail == null) {
                h = tail = head;
            } else if (head.val != tail.val) {
                tail.next = head;
                tail = head;
            }
            head = head.next;
        }
        tail.next = null;
        return h;
    }
}
