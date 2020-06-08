package org.alking.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoListsTest {

    @Test
    public void mergeTwoListsTest(){
        MergeTwoLists mtl = new MergeTwoLists();


        ListNode l1 = ListNode.parseListNode(new int[]{1,2,4});
        ListNode l2 = ListNode.parseListNode(new int[]{1,3,4});

        ListNode result = mtl.mergeTwoLists(l1,l2);

        Assert.assertEquals(1,result.val);

        result = result.next;
        Assert.assertEquals(1,result.val);

        result = result.next;
        Assert.assertEquals(2,result.val);

        result = result.next;
        Assert.assertEquals(3,result.val);

        result = result.next;
        Assert.assertEquals(4,result.val);

        result = result.next;
        Assert.assertEquals(4,result.val);

        result = result.next;
        Assert.assertNull(result);

    }
}
