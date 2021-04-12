package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P377Test {

    @Test
    public void test(){
        P377 p377 = new P377();
        int[] nums = new int[]{1,2,3};
        int target = 4;
        int result = p377.combinationSum4(nums,target);
        Assert.assertEquals(7, result);

        nums = new int[]{9};
        target = 3;
        result = p377.combinationSum4(nums,target);
        Assert.assertEquals(0, result);
    }
}
