package org.alking.offer;

import org.alking.common.ListNode;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class O6 {

    public int[] reversePrint(ListNode head) {

        int c = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            c += 1;
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[c];
        int idx = 0;
        while (!stack.isEmpty()) {
            result[idx++] = stack.pop();
        }
        return result;

    }
}
