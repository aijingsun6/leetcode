package org.alking.p1200;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class P1290 {

    public int getDecimalValue(ListNode head) {

        int result = 0;

        while (head != null) {
            result = (result << 1) + head.val;
            head = head.next;
        }
        return result;
    }
}
