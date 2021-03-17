package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P81Test {

    @Test
    public void test(){
        P81 p81 = new P81();
        int[] nums = new int[]{2,5,6,0,0,1,2};
        int target = 0;
        boolean result = p81.search(nums,target);
        Assert.assertTrue(result);

        target = 3;
        result = p81.search(nums,target);
        Assert.assertFalse(result);

        nums = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        target = 2;

        result = p81.search(nums,target);
        Assert.assertTrue(result);

    }
}
