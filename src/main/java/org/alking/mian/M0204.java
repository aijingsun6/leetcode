package org.alking.mian;

import org.alking.common.ListNode;

/**
 * https://leetcode-cn.com/problems/partition-list-lcci/
 */
public class M0204 {

    public ListNode partition(ListNode head, int x) {

        ListNode dummyL = new ListNode(0);
        ListNode tailL = null;

        ListNode dummyR = new ListNode(0);
        ListNode tailR = null;

        ListNode h = head;
        while (h != null) {

            if (h.val < x) {
                if (tailL == null) {
                    dummyL.next = h;
                } else {
                    tailL.next = h;
                }
                tailL = h;
            } else {
                if (tailR == null) {
                    dummyR.next = h;
                } else {
                    tailR.next = h;
                }
                tailR = h;
            }

            h = h.next;
        }

        if (tailL != null) {
            tailL.next = dummyR.next;
        } else {
            dummyL.next = dummyR.next;
        }
        if (tailR != null) {
            tailR.next = null;
        }
        return dummyL.next;
    }
}
