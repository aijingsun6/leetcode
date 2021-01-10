package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P92Test {

    @Test
    public void test(){
        P92 p92 = new P92();
        int n = 5;
        P92.ListNode[] nodes = new P92.ListNode[n];
        for(int i = 0;i < n;i++){
            nodes[i] = new P92.ListNode(i +1);
            if(i > 0){
                nodes[i-1].next = nodes[i];
            }
        }
        P92.ListNode result = p92.reverseBetween(nodes[0],2,4);
        int[] values = new int[]{1,4,3,2,5};
        int acc = 0;
        while (result != null){
            Assert.assertEquals( values[acc],result.val);
            result = result.next;
            acc +=1;
        }
    }
}
