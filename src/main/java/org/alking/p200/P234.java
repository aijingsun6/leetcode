package org.alking.p200;

import org.alking.common.ListNode;

public class P234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        if (head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            if(slow == fast){
                // has cycle
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right;
        if (fast.next == null) {
            // 偶节点数
            right = slow.next;
        } else {
            // 奇节点数
            right = slow.next.next;
        }
        slow.next = null;
        right = reverse(right);
        return isSame(head, right);
    }

    private boolean isSame(ListNode left, ListNode right) {

        while (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        if (left != null || right != null) {
            return false;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode res = null;
        ListNode t;
        while (head != null) {
            t = head.next;
            head.next = res;
            res = head;
            head = t;
        }
        return res;
    }
}
