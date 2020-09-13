package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P697Test {

    @Test
    public void test(){
        P697 p697 = new P697();
        int[] nums = {1,2,2,3,1};
        int ret = p697.findShortestSubArray(nums);
        Assert.assertEquals(2, ret);
    }
}
