package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P47Test {

    @Test
    public void test(){
        P47 p47 = new P47();
        int[] nums = new int[]{1,1,2};
        List<List<Integer>> result = p47.permuteUnique(nums);
        Assert.assertEquals(3,result.size());

        nums = new int[]{1,1,1,1};
        result = p47.permuteUnique(nums);
        Assert.assertEquals(1,result.size());


        nums = new int[]{1,2,3,4};
        result = p47.permuteUnique(nums);
        Assert.assertEquals(24,result.size());
    }
}
