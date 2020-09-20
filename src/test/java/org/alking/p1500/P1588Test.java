package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1588Test {

    @Test
    public void test(){
        P1588 p1588 = new P1588();
        int[] nums = new int[]{1,4,2,5,3};
        int res = p1588.sumOddLengthSubarrays(nums);
        Assert.assertEquals(58,res);
    }
}
