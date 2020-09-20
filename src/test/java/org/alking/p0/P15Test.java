package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P15Test {

    @Test
    public void test(){
        P15 p15 = new P15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = p15.threeSum(nums);
        Assert.assertEquals(2, result.size());
    }
}
