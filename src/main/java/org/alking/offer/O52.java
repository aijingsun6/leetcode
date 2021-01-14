package org.alking.offer;

import org.alking.common.ListNode;

public class O52 {

    private int size(ListNode head) {

        int n = 0;
        while (head != null) {
            n += 1;
            head = head.next;
        }
        return n;

    }

    private ListNode walk(ListNode head, int n) {
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        return head;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sA = size(headA);
        int sB = size(headB);
        ListNode wA = headA;
        ListNode wB = headB;
        if (sA > sB) {
            wA = walk(headA, sA - sB);
        } else if (sB > sA) {
            wB = walk(headB, sB - sA);
        }

        while (wA != wB) {
            wA = wA.next;
            wB = wB.next;
        }
        return wA;
    }
}
