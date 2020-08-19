package org.alking.p0;

import java.util.Map;
import java.util.TreeMap;

/**
 * <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/submissions/"></a>
 */
public class P23 {

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

    public static class SortNode {
        ListNode head;
        ListNode tail;

        public SortNode(ListNode head, ListNode tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        TreeMap<Integer, SortNode> map = new TreeMap<>();
        for (ListNode n : lists) {
            while (n != null) {
                int val = n.val;
                if (map.containsKey(val)) {
                    SortNode sn = map.get(val);
                    sn.tail.next = n;
                    sn.tail = n;
                } else {
                    map.put(val, new SortNode(n, n));
                }

                n = n.next;
            }
        }

        ListNode head = null;
        ListNode tail = null;
        for (Map.Entry<Integer, SortNode> entry : map.entrySet()) {
            if (head == null) {
                head = entry.getValue().head;
                tail = entry.getValue().tail;
            } else {
                tail.next = entry.getValue().head;
                tail = entry.getValue().tail;
            }
        }
        return head;
    }

//    public ListNode mergeKLists(ListNode[] lists) {
//
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//        ListNode head = new ListNode(0);
//        ListNode t = head;
//        while (true) {
//
//            ListNode next = null;
//            int idx = -1;
//            for (int i = 0; i < lists.length; i++) {
//
//                if (next == null) {
//
//                    if (lists[i] != null) {
//                        next = lists[i];
//                        idx = i;
//                    }
//
//                } else {
//
//                    if (lists[i] != null && lists[i].val < next.val) {
//                        next = lists[i];
//                        idx = i;
//                    }
//
//                }
//            }
//
//            if (next == null) {
//                break;
//            }
//            t.next = next;
//            lists[idx] = lists[idx].next;
//            t = t.next;
//        }
//
//        return head.next;
//    }
}
