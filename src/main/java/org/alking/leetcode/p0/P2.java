package org.alking.leetcode.p0;

import org.alking.leetcode.common.ListNode;

public class P2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode n = new ListNode(sum % 10);
            carry = sum / 10;
            tail.next = n;
            tail = tail.next;
        }
        if (carry > 0) {
            ListNode n = new ListNode(carry);
            tail.next = n;
            tail = tail.next;
        }
        return dummy.next;
    }

}
