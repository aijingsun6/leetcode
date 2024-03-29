package org.alking.offer;

import org.alking.common.ListNode;

public class O22 {

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
