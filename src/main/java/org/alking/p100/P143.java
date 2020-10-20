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
        LinkedList<ListNode> queue = new LinkedList<>();
        ListNode n = head;
        while (n != null) {
            queue.addLast(n);
            n = n.next;
        }
        ListNode tail = queue.removeFirst();
        while (queue.peek() != null){
            n = queue.removeLast();
            tail.next = n;
            tail = n;
            if(queue.peek() == null){
                break;
            }
            n = queue.removeFirst();
            tail.next = n;
            tail = n;
        }
        tail.next = null;
    }
}
