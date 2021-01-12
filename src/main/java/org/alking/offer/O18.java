package org.alking.offer;

public class O18 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {

        if (head.val == val) {
            ListNode tail = head.next;
            head.next = null;
            return tail;
        }
        ListNode h = head;
        while (h.next != null && h.next.val != val) {
            h = h.next;
        }
        if (h.next != null && h.next.val == val) {
            h.next = h.next.next;
        }
        return head;

    }
}
