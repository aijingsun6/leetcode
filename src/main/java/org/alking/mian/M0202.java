package org.alking.mian;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
public class M0202 {

    public int kthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow == null ? 0 : slow.val;
    }
}
