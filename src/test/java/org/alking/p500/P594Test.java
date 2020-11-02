package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P594Test {
    @Test
    public void test(){
        P594 p594 = new P594();
        int[] nums = new int[]{1,3,2,2,5,2,3,7};
        int res = p594.findLHS(nums);
        Assert.assertEquals(5,res);
    }
}
