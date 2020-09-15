package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P581Test {

    @Test
    public void test(){
        P581 p581 = new P581();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        int ret = p581.findUnsortedSubarray(nums);
        Assert.assertEquals(5,ret);
    }
}
