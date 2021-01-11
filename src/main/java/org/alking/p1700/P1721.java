package org.alking.p1700;

public class P1721 {

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


    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        ListNode first = fast;
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int v = first.val;
        first.val = slow.val;
        slow.val = v;
        return head;
    }
}
