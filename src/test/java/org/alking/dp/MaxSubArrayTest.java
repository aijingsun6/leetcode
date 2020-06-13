package org.alking.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayTest {

    private MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    public void maxSubArrayTest() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(6,maxSubArray.maxSubArray(arr));
    }
}
