package org.alking.linkedlist;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveNthFromEndTest {

    @Test
    public void removeNthFromEnd(){
        RemoveNthFromEnd rnf = new RemoveNthFromEnd();
        ListNode head = ListNode.parseListNode(new int[]{1,2,3,4,5});
        ListNode result = rnf.removeNthFromEnd(head,2);

        Assert.assertEquals(1,result.val);
        result = result.next;
        Assert.assertEquals(2,result.val);
        result = result.next;
        Assert.assertEquals(3,result.val);
        result = result.next;
        Assert.assertEquals(5,result.val);

        head = ListNode.parseListNode(new int[]{1,2});
        result = rnf.removeNthFromEnd(head,2);
        Assert.assertEquals(2,result.val);
        result = result.next;
        Assert.assertNull(result);


    }
}
