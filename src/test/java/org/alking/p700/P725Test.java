package org.alking.p700;

import org.alking.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class P725Test {

    @Test
    public void test(){
        ListNode[] arr = new ListNode[4];
        for(int i = 0; i < arr.length;i++){
            arr[i] = new ListNode(i);
            if(i > 0){
                arr[i-1].next = arr[i];
            }
        }
        P725 p725 = new P725();
        ListNode[] result = p725.splitListToParts(arr[0],5);
        Assert.assertEquals(0,result[0].val);

    }
}
