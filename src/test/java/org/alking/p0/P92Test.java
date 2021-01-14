package org.alking.p0;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P92Test {

    @Test
    public void test(){
        P92 p92 = new P92();
        int n = 5;
        ListNode[] nodes = new ListNode[n];
        for(int i = 0;i < n;i++){
            nodes[i] = new ListNode(i +1);
            if(i > 0){
                nodes[i-1].next = nodes[i];
            }
        }
        ListNode result = p92.reverseBetween(nodes[0],2,4);
        int[] values = new int[]{1,4,3,2,5};
        int acc = 0;
        while (result != null){
            Assert.assertEquals( values[acc],result.val);
            result = result.next;
            acc +=1;
        }
    }
}
