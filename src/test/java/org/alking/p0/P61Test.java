package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P61Test {

    @Test
    public void test(){

        P61.ListNode n1 = new P61.ListNode(1);
        n1.next = new P61.ListNode(2);

        P61 p61 = new P61();
        P61.ListNode ret = p61.rotateRight(n1,1);
        Assert.assertEquals(2, ret.val);
        Assert.assertEquals(1, ret.next.val);
    }
}
