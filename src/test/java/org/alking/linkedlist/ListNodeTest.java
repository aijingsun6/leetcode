package org.alking.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void hasCycleTest(){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;
        ListNode ln = new ListNode(1);
        Assert.assertTrue(ln.hasCycle(n1));

    }
}
