package org.alking.linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        if(head == null){
            // null
            return null;
        }
        if(head.next == null){
            // 1 element
            return head;
        }
        if(head.next.next == null){
            // 2 elements
            ListNode result = head.next;
            head.next = null;
            result.next = head;
            return result;
        }
        // > 2 elements

        ListNode p1 = head.next.next;
        ListNode p2 = head.next;
        ListNode p3 = head;
        // tail.next = null
        head.next = null;
        while (p1 != null){
            p2.next = p3;
            p3 = p2;
            p2 = p1;
            p1 = p1.next;
        }
        p2.next = p3;
        return p2;
    }
}
