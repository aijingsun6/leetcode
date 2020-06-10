package org.alking.linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            // null
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = null;
        while (p1.next != null) {
            ListNode t = p1.next;
            p1.next = p2;
            p2 = p1;
            p1 = t;
        }
        p1.next = p2;
        return p1;
    }
}
