package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1437Test {

    @Test
    public void test(){
        P1437 p1437 = new P1437();
        int[] nums = new int[]{1,0,0,0,1,0,0,1};
        int k = 2;
        boolean result = p1437.kLengthApart(nums,k);
        Assert.assertTrue(result);

        nums = new int[]{1,0,0,1,0,1};
        result = p1437.kLengthApart(nums,k);
        Assert.assertFalse(result);
    }
}
