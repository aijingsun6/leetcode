package org.alking.p700;

import org.alking.common.ListNode;

public class P725 {

    public ListNode[] splitListToParts(ListNode root, int k) {
        int size = size(root);
        int len = size / k;
        int left = size % k;
        ListNode[] result = new ListNode[k];
        ListNode dummy = new ListNode(0);
        for (int i = 0; i < k; i++) {
            if (root == null) {
                break;
            }
            int count = len;
            if (left > 0) {
                left -= 1;
                count += 1;
            }
            ListNode tail = dummy;
            for (int j = 0; j < count && root != null; j++) {
                tail.next = root;
                tail = root;
                root = root.next;
            }
            tail.next = null;
            result[i] = dummy.next;
        }
        return result;

    }

    public int size(ListNode node) {

        int acc = 0;
        while (node != null) {
            acc += 1;
            node = node.next;
        }
        return acc;
    }

}
