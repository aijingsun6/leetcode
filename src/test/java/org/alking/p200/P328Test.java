package org.alking.p200;

import org.alking.common.ListNode;
import org.alking.p300.P328;
import org.junit.Assert;
import org.junit.Test;

public class P328Test {

    @Test
    public void test(){
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = parseNode(nums);
        ListNode acc = new P328().oddEvenList(head);
        Assert.assertTrue(acc.val == 1);
    }

    private ListNode parseNode(int[] nums){

        ListNode[] arr = new ListNode[nums.length];
        for(int i = 0; i < nums.length;i++){
            arr[i] = new ListNode(nums[i]);
            if(i > 0){
                arr[i-1].next = arr[i];
            }
        }
        return arr[0];
    }
}
