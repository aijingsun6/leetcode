package org.alking.p0;

import java.util.HashSet;

public class P82 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        ListNode h = head;
        while (h != null) {
            int v = h.val;
            if (set.contains(v)) {
                dup.add(v);
            }
            set.add(v);
            h = h.next;
        }
        ListNode dum = new ListNode(0);
        ListNode tail = null;
        h = head;
        while (h != null) {
            int v = h.val;
            if (!dup.contains(v)) {
                if (tail == null) {
                    dum.next = h;
                } else {
                    tail.next = h;
                }
                tail = h;
            }
            h = h.next;
        }
        if (tail != null) {
            tail.next = null;
        }
        return dum.next;
    }
}
