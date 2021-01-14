package org.alking.p1000;

import org.alking.common.ListNode;

import java.util.ArrayDeque;

public class P1019 {

    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode h = head;
        while (h != null) {
            n += 1;
            h = h.next;
        }
        int[] result = new int[n];
        ArrayDeque<Integer> vQueue = new ArrayDeque<>();
        ArrayDeque<Integer> idxQueue = new ArrayDeque<>();
        h = head;
        int idx = 0;
        while (h != null) {
            int v = h.val;
            while (!vQueue.isEmpty() && vQueue.getLast() < v) {
                vQueue.removeLast();
                result[idxQueue.removeLast()] = v;
            }
            vQueue.addLast(v);
            idxQueue.addLast(idx);
            h = h.next;
            idx = idx + 1;

        }

        while (!vQueue.isEmpty()) {
            vQueue.removeLast();
            result[idxQueue.removeLast()] = 0;
        }
        return result;
    }
}
