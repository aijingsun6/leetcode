package org.alking.p400;

import java.util.Stack;

public class P445 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private Stack<Integer> node2Stack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        return stack;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = node2Stack(l1);
        Stack<Integer> s2 = node2Stack(l2);
        ListNode head = null;
        int carry = 0;
        while (!s1.isEmpty() && !s2.empty()) {
            int v = s1.pop() + s2.pop() + carry;
            carry = v / 10;
            v = v % 10;
            ListNode n = new ListNode(v);
            n.next = head;
            head = n;
        }
        Stack<Integer> s = s1.isEmpty() ? s2 : s1;
        while (!s.isEmpty()) {
            int v = s.pop() + carry;
            carry = v / 10;
            v = v % 10;
            ListNode n = new ListNode(v);
            n.next = head;
            head = n;
        }
        if (carry > 0) {
            ListNode n = new ListNode(1);
            n.next = head;
            head = n;
        }
        return head;
    }
}
