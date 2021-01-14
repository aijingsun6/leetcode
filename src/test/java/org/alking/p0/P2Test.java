package org.alking.p0;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P2Test {

    @Test
    public void test(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        P2 p2 = new P2();
        ListNode n = p2.addTwoNumbers(l1,l2);
        Assert.assertEquals(7,n.val);
        Assert.assertEquals(0,n.next.val);
        Assert.assertEquals(8,n.next.next.val);
    }
}
