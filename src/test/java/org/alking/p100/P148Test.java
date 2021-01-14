package org.alking.p100;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P148Test {

    @Test
    public void test() {
        ListNode[] nodes = new ListNode[4];
        nodes[0] = new ListNode(4);
        nodes[1] = new ListNode(2);
        nodes[2] = new ListNode(1);
        nodes[3] = new ListNode(3);
        for (int i = 0; i < nodes.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }
        P148 p148 = new P148();
        ListNode head = p148.sortList(nodes[0]);
        Assert.assertEquals(1, head.val);
        Assert.assertEquals(2, head.next.val);
        Assert.assertEquals(3, head.next.next.val);
        Assert.assertEquals(4, head.next.next.next.val);
        Assert.assertEquals(null, head.next.next.next.next);
    }
}
