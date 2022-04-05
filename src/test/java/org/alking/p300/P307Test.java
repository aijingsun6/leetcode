package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P307Test {

    @Test
    public void test(){
        int[] nums = new int[]{1,3,5};
        P307.NumArray na = new P307.NumArray(nums);
        int result = na.sumRange(0,2);
        Assert.assertEquals(9,result);
        na.update(1, 2);
        result = na.sumRange(0,2);
        Assert.assertEquals(8,result);
    }
}
