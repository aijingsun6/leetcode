package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P494Test {

    @Test
    public void test() {
        P494 p494 = new P494();
        int[] nums = new int[]{1,1,1,1,1};
        int target = 3;
        int result = p494.findTargetSumWays(nums,target);
        Assert.assertEquals(5, result);

        nums = new int[]{1,1,1,1,1};
        target = 5;
        result = p494.findTargetSumWays(nums,target);
        Assert.assertEquals(1, result);
    }
}
