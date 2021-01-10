package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1171Test {

    private P1171.ListNode parseNodes(int[] values){
        P1171.ListNode[] nodes = new P1171.ListNode[values.length];
        for(int i = 0; i < values.length;i++){
            nodes[i] = new P1171.ListNode(values[i]);
            if(i > 0){
                nodes[i-1].next = nodes[i];
            }
        }
        return nodes[0];
    }

    @Test
    public void test(){
        P1171 p1171 = new P1171();
        P1171.ListNode head = parseNodes(new int[]{1,2,-3,3,1});
        P1171.ListNode result = p1171.removeZeroSumSublists(head);
        Assert.assertEquals(3,result.val);
        Assert.assertEquals(1,result.next.val);


    }
}
