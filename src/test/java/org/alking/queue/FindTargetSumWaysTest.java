package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class FindTargetSumWaysTest {

    @Test
    public void test(){
        FindTargetSumWays fts = new FindTargetSumWays();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int target = 3;
        int result = fts.findTargetSumWays(nums,target);
        Assert.assertEquals(5,result);
    }
}
