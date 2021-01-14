package org.alking.p100;

import org.alking.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class P142 {


    public ListNode detectCycle(ListNode head) {

        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }

        return null;

    }
}
