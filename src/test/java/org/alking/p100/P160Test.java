package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P160Test {

    @Test
    public void test(){

        // 1 -> 2 -> 3 -> 4 -> 5
        // 6 -> 7 ->
        P160.ListNode n1 = new P160.ListNode(1);
        P160.ListNode n2 = new P160.ListNode(2);
        P160.ListNode n3 = new P160.ListNode(3);
        P160.ListNode n4 = new P160.ListNode(4);
        P160.ListNode n5 = new P160.ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        P160.ListNode n6 = new P160.ListNode(6);
        P160.ListNode n7 = new P160.ListNode(7);
        n6.next = n7;
        n7.next = n3;

        P160 p160 = new P160();
        P160.ListNode ans = p160.getIntersectionNode(n1,n6);
        Assert.assertEquals(n3.val,ans.val);
    }
}
