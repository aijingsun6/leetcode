package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P34Test {

    @Test
    public void test(){
        P34 p34 = new P34();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int[] result = p34.searchRange(nums,target);
        Assert.assertArrayEquals(new int[]{3,4},result);

        nums = new int[]{2,2};
        target = 1;
        result = p34.searchRange(nums,target);
        Assert.assertArrayEquals(new int[]{-1,-1},result);
    }
}
