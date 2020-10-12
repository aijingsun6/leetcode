package org.alking.p0;

public class P24 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode n = head;
        ListNode nn = head.next;
        ListNode next = nn.next;

        ListNode h = nn;
        ListNode t = n;
        h.next = t;
        t.next = next;
        while (t.next != null && t.next.next != null) {
            n = t.next;
            nn = n.next;
            next = nn.next;

            t.next = nn;
            t.next.next = n;
            t = n;
            t.next = next;
        }
        return h;
    }
}
