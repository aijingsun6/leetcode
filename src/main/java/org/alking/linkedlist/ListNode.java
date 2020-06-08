package org.alking.linkedlist;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode parseListNode(int[] arr) {

        ListNode[] nAcc = new ListNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nAcc[i] = new ListNode(arr[i]);
            if (i > 0) {
                nAcc[i - 1].next = nAcc[i];
            }
        }
        return nAcc[0];
    }
}
