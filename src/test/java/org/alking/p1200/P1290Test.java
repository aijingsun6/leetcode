package org.alking.p1200;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P1290Test {

    @Test
    public void test(){
        P1290 p1290 = new P1290();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;

        int result = p1290.getDecimalValue(n1);
        Assert.assertEquals(5,result);

    }
}
