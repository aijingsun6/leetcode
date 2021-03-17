package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P90Test {

    @Test
    public void test(){
        P90 p90 = new P90();

        int[] nums = new int[]{1,2,2};
        List<List<Integer>> acc= p90.subsetsWithDup(nums);
        Assert.assertEquals(6,acc.size());

        nums = new int[]{0};
        acc= p90.subsetsWithDup(nums);
        Assert.assertEquals(2,acc.size());

    }
}
