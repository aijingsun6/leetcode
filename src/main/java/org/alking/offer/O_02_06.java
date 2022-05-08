package org.alking.offer;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 */
public class O_02_06 {

    public boolean isPalindrome(final ListNode head) {
        ListNode h = head;
        ListNode tail = null;
        while (h != null) {
            ListNode n = new ListNode(h.val);
            n.next = tail;
            tail = n;
            h = h.next;
        }
        h = head;
        while (h != null) {
            if (h.val != tail.val) {
                return false;
            }
            h = h.next;
            tail = tail.next;
        }
        return true;
    }
}
