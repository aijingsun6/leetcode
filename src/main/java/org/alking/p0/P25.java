package org.alking.p0;

public class P25 {

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

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }
        ListNode root = null;
        ListNode tail = null;
        while (head != null) {
            ListNode[] rev = reverse(head, k);
            if(root == null){
                root = rev[0];
                tail = rev[1];
                head = rev[2];
            }else {
                tail.next=rev[0];
                tail = rev[1];
                head = rev[2];
            }
        }
        return root;
    }

    // [head,tail,next]
    private ListNode[] reverse(ListNode node, int k) {

        ListNode tail = node;
        ListNode head = node;
        ListNode next;
        int acc = 1;
        node = node.next;
        while (node != null && acc < k) {
            next = node.next;
            node.next = head;
            head = node;
            node = next;
            acc++;
        }
        tail.next = null;
        if (acc == k) {
            return new ListNode[]{head, tail, node};
        }
        node = head;
        node = node.next;
        head.next = null;
        while (node != null) {
            next = node.next;
            node.next = head;
            head = node;
            node = next;
        }
        return new ListNode[]{head, null, null};
    }
}
