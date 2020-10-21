package org.alking.p100;

public class P148 {
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

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode[] cut = cut(head);
        return null;


    }

    private ListNode[] cut(ListNode head) {
        if (head == null) {
            return null;
        }
        int v = head.val;

        ListNode[] res = new ListNode[6];

        ListNode eDummy = new ListNode(0);
        ListNode eTail = eDummy;

        ListNode leftDummy = new ListNode(0);
        ListNode leftTail = leftDummy;

        ListNode rightDummy = new ListNode(0);
        ListNode rightTail = rightDummy;

        while (head != null) {
            if (head.val < v) {
                leftTail.next = head;
                leftTail = head;
            } else if (head.val > v) {
                rightTail.next = head;
                rightTail = head;
            } else {
                eTail.next = head;
                eTail = head;
            }
            head = head.next;
        }
        eTail.next = null;
        leftTail.next = null;
        rightTail.next = null;
        res[0] = leftDummy.next;
        res[1] = leftTail;

        res[2] = eDummy.next;
        res[3] = eTail;

        res[4] = rightDummy.next;
        res[5] = rightTail;
        return res;
    }

}
