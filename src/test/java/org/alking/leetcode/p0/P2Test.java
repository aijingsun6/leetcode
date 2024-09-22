package org.alking.leetcode.p0;

import org.alking.leetcode.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P2Test {

    @Test
    public void test(){
        ListNode l1 = ListNode.parseListNode(new int[]{2,4,3});
        ListNode l2 = ListNode.parseListNode(new int[]{5,6,4});
        P2 p2 = new P2();
        ListNode r = p2.addTwoNumbers(l1, l2);
        int[] expect = new int[]{7,0,8};
        Assert.assertArrayEquals(expect, ListNode.toValueArray(r));

        l1 = ListNode.parseListNode(new int[]{0});
        l2 = ListNode.parseListNode(new int[]{0});
        r = p2.addTwoNumbers(l1, l2);
        expect = new int[]{0};
        Assert.assertArrayEquals(expect, ListNode.toValueArray(r));

        l1 = ListNode.parseListNode(new int[]{9,9,9,9,9,9,9});
        l2 = ListNode.parseListNode(new int[]{9,9,9,9});
        r = p2.addTwoNumbers(l1, l2);
        expect = new int[]{8,9,9,9,0,0,0,1};
        Assert.assertArrayEquals(expect, ListNode.toValueArray(r));
    }
}
