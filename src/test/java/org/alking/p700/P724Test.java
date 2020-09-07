package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P724Test {

    @Test
    public void test(){
        int[] nums = new int[]{-1,-1,-1,0,1,1};
        P724 p724 = new P724();
        int idx = p724.pivotIndex(nums);
        Assert.assertEquals(0,idx);
    }
}
