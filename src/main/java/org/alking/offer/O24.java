package org.alking.offer;

public class O24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode h = null;
        ListNode t = null;
        while (head != null) {
            t = head.next;
            if (h == null) {
                h = head;
                h.next = null;
            } else {
                head.next = h;
                h = head;
            }
            head = t;
        }
        return h;
    }
}
