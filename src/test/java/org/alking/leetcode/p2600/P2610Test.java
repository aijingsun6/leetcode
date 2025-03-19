package org.alking.leetcode.p2600;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P2610Test {

    @Test
    public void test(){
        P2610 p2610 = new P2610();
        int[] nums = new int[]{1,3,4,1,2,3,1};
        List<List<Integer>> r= p2610.findMatrix(nums);
        List<List<Integer>> e= Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(1,3),Arrays.asList(1));
        Assert.assertEquals(e,r);
    }
}
