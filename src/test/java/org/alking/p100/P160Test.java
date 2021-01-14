package org.alking.p100;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P160Test {

    @Test
    public void test(){

        // 1 -> 2 -> 3 -> 4 -> 5
        // 6 -> 7 ->
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n6.next = n7;
        n7.next = n3;

        P160 p160 = new P160();
        ListNode ans = p160.getIntersectionNode(n1,n6);
        Assert.assertEquals(n3.val,ans.val);
    }
}
