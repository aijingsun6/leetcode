package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P18Test {

    @Test
    public void test(){
        P18 p18 = new P18();

        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = p18.fourSum(nums,target);
        Assert.assertEquals(3,result.size());
    }
}
