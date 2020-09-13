package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P746Test {

    @Test
    public void test(){
        P746 p746 = new P746();
        int result = p746.minCostClimbingStairs(new int[]{10,15,20});
        Assert.assertEquals(15, result);

        result = p746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        Assert.assertEquals(6, result);
    }
}
