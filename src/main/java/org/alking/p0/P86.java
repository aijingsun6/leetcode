package org.alking.p0;

public class P86 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode smallTail = null;
        ListNode largeDummy = new ListNode(0);
        ListNode largeTail = null;
        while (head != null) {
            int v = head.val;
            if (v < x) {
                if (smallTail == null) {
                    smallDummy.next = head;
                }else {
                    smallTail.next = head;
                }
                smallTail = head;

            } else {
                if (largeTail == null) {
                    largeDummy.next = head;
                }else {
                    largeTail.next = head;
                }
                largeTail = head;
            }
            head = head.next;
        }

        if (smallTail != null) {
            smallTail.next = null;
        }
        if (largeTail != null) {
            largeTail.next = null;
        }
        if (smallTail == null) {
            return largeDummy.next;
        }
        smallTail.next = largeDummy.next;
        return smallDummy.next;
    }
}
