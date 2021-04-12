package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P220Test {

    @Test
    public void test(){
        P220 p220 = new P220();
        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        int t = 0;
        boolean result = p220.containsNearbyAlmostDuplicate(nums,k,t);
        Assert.assertTrue(result);

        nums = new int[]{1,5,9,1,5,9};
        k = 2;
        t = 3;
        result = p220.containsNearbyAlmostDuplicate(nums,k,t);
        Assert.assertFalse(result);

        nums = new int[]{-2147483648,2147483647};
        k = 1;
        t = 1;
        result = p220.containsNearbyAlmostDuplicate(nums,k,t);
        Assert.assertFalse(result);

    }
}
