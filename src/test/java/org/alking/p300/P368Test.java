package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P368Test {

    @Test
    public void test(){

        P368 p368 = new P368();
        int[] nums = new int[]{1,2,4,8};
        List<Integer> result = p368.largestDivisibleSubset(nums);
        Assert.assertEquals(4,result.size());

        nums = new int[]{2,3,4,9,8};
        result = p368.largestDivisibleSubset(nums);
        Assert.assertEquals(3,result.size());

        nums = new int[]{3,4,16,8};
        result = p368.largestDivisibleSubset(nums);
        Assert.assertEquals(3,result.size());

    }
}
