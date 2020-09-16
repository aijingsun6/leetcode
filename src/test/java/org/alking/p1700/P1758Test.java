package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1758Test {

    @Test
    public void test(){
        P1758 p1758 = new P1758();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum = p1758.maxSubArray(nums);
        Assert.assertEquals(6, sum);

    }
}
