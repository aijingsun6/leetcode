package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P477Test {

    @Test
    public void test(){
        P477 p477 = new P477();
        int[] nums = new int[]{4, 14, 2};
        int result = p477.totalHammingDistance(nums);
        int expect = 6;
        Assert.assertEquals(expect,result);
    }
}
