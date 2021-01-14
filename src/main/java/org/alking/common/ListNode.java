package org.alking.common;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    private static int size(ListNode head) {

        int n = 0;
        while (head != null) {
            n += 1;
            head = head.next;
        }
        return n;

    }

    private static ListNode walk(ListNode head, int n) {
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        return head;
    }
}
