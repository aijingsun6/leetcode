package org.alking.p100;

public class P160 {

    public static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int sizeA = size(headA);
        int sizeB = size(headB);
        if (sizeA > sizeB) {
            headA = walkN(headA, sizeA - sizeB);
        } else if (sizeB > sizeA) {
            headB = walkN(headB, sizeB - sizeA);
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count += 1;
            head = head.next;
        }
        return count;
    }

    private ListNode walkN(ListNode head, int n) {
        ListNode node = null;
        for (int i = 0; i < n; i++) {
            head = head.next;
            node = head;
        }
        return node;
    }

    private ListNode reverse(ListNode head) {
        ListNode tail = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = tail;
            tail = head;
            head = next;
        }
        return tail;
    }
}
