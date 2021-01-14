package org.alking.mian;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
public class M0201 {

    public ListNode removeDuplicateNodes(ListNode head) {
        boolean[] visit = new boolean[20001];
        ListNode tail = null;
        ListNode h = head;
        while (h != null) {
            int v = h.val;
            if (!visit[v]) {
                if (tail != null) {
                    tail.next = h;
                }
                tail = h;
                visit[v] = true;

            }
            h = h.next;
        }
        if(tail != null){
            tail.next = null;
        }

        return head;

    }
}
