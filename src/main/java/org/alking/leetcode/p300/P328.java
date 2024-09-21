package org.alking.leetcode.p300;

import org.alking.leetcode.common.ListNode;

public class P328 {


    public ListNode oddEvenList(ListNode head) {

        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }
}
