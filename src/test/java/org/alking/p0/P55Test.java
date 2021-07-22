package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P55Test {

    @Test
    public void test(){
        P55 p55 = new P55();
        int[] nums = new int[]{2,3,1,1,4};
        Assert.assertTrue(p55.canJump(nums));

        nums = new int[]{3,2,1,0,4};
        Assert.assertTrue(!p55.canJump(nums));
    }
}
