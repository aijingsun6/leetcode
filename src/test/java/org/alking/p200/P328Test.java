package org.alking.p200;

import org.alking.p300.P328;
import org.junit.Assert;
import org.junit.Test;

public class P328Test {

    @Test
    public void test(){
        int[] nums = new int[]{1,2,3,4,5};
        P328.ListNode head = parseNode(nums);
        P328.ListNode acc = new P328().oddEvenList(head);
        Assert.assertTrue(acc.val == 1);
    }

    private P328.ListNode parseNode(int[] nums){

        P328.ListNode[] arr = new P328.ListNode[nums.length];
        for(int i = 0; i < nums.length;i++){
            arr[i] = new P328.ListNode(nums[i]);
            if(i > 0){
                arr[i-1].next = arr[i];
            }
        }
        return arr[0];
    }
}
