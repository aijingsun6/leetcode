package org.alking.p100;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class P143 {

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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ArrayDeque<ListNode> queue = new ArrayDeque<>();
        ListNode n = head;
        while (n != null) {
            queue.addLast(n);
            n = n.next;
        }
        ListNode tail = queue.removeFirst();
        while (!queue.isEmpty()){
            n = queue.removeLast();
            tail.next = n;
            tail = n;
            if(queue.isEmpty()){
                break;
            }
            n = queue.removeFirst();
            tail.next = n;
            tail = n;
        }
        tail.next = null;
    }
}
