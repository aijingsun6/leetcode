package org.alking.p1100;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P1171Test {

    private ListNode parseNodes(int[] values){
        ListNode[] nodes = new ListNode[values.length];
        for(int i = 0; i < values.length;i++){
            nodes[i] = new ListNode(values[i]);
            if(i > 0){
                nodes[i-1].next = nodes[i];
            }
        }
        return nodes[0];
    }

    @Test
    public void test(){
        P1171 p1171 = new P1171();
        ListNode head = parseNodes(new int[]{1,2,-3,3,1});
        ListNode result = p1171.removeZeroSumSublists(head);
        Assert.assertEquals(3,result.val);
        Assert.assertEquals(1,result.next.val);


    }
}
