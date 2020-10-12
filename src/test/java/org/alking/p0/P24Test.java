package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P24Test {

    @Test
    public void test(){
        int size = 4;
        P24.ListNode[] nodes = new P24.ListNode[4];
        for(int i = 0; i < size;i++){
            nodes[i] = new P24.ListNode(i + 1);
            if(i > 0){
                nodes[i-1].next = nodes[i];
            }
        }
        P24 p24 = new P24();
        P24.ListNode head = p24.swapPairs(nodes[0]);
        Assert.assertEquals(2,head.val);
    }
}
