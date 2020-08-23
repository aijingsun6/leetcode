package org.alking.p1200;

/**
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class P1290 {

    public static class ListNode {

        public int val;

        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {

        int result = 0;

        while (head != null) {
            result = (result << 1) + head.val;
            head = head.next;
        }
        return result;
    }
}
