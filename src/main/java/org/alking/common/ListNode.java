package org.alking.common;

import java.util.LinkedList;
import java.util.List;

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

    public static ListNode[] toArray(ListNode head) {
        if (head == null) {
            return null;
        }
        List<ListNode> acc = new LinkedList<>();
        while (head != null) {
            acc.add(head);
            head = head.next;
        }
        ListNode[] result = new ListNode[acc.size()];
        acc.toArray(result);
        return result;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            // null
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = null;
        ListNode t;
        while (p1 != null) {
            t = p1.next;
            p1.next = p2;
            p2 = p1;
            p1 = t;
        }
        return p2;
    }

    /**
     * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/6/linked-list/46/
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }
        if(head.next == null){
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;

        while (true){
            if(fast == slow){
                return true;
            }
            boolean fastEnd = fast.next != null && fast.next.next != null;
            boolean slowEnd = slow.next != null;
            if(fastEnd && slowEnd){
                fast = fast.next.next;
                slow = slow.next;
            }else {
                return false;
            }
        }
    }
}
