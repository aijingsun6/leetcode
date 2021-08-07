package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P457Test {

    @Test
    public void test(){
        P457 p457 = new P457();
        int[] nums = new int[]{2,-1,1,2,2};
        boolean result = p457.circularArrayLoop(nums);
        Assert.assertTrue(result);

        nums = new int[]{-1,2};
        result = p457.circularArrayLoop(nums);
        Assert.assertFalse(result);

        nums = new int[]{1,1,1,1,1,1,1};
        result = p457.circularArrayLoop(nums);
        Assert.assertTrue(result);

        nums = new int[]{-2,1,-1,-2,-2};
        result = p457.circularArrayLoop(nums);
        Assert.assertFalse(result);

    }
}
