package org.alking.linkedlist;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseListTest {

    @Test
    public void reverseListTest(){

        ListNode head = ListNode.parseListNode(new int[]{1,2,3,4,5});
        ReverseList rl = new ReverseList();
        ListNode result = rl.reverseList(head);

        Assert.assertEquals(5,result.val);

        result = result.next;
        Assert.assertEquals(4,result.val);
        result = result.next;
        Assert.assertEquals(3,result.val);
        result = result.next;
        Assert.assertEquals(2,result.val);
        result = result.next;
        Assert.assertEquals(1,result.val);
        result = result.next;
        Assert.assertNull(result);

    }
}
