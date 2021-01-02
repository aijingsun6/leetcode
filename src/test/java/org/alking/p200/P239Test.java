package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P239Test {

    @Test
    public void test(){
        P239 p239 = new P239();
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int[] result = p239.maxSlidingWindow(nums,3);
        int[] expect = new int[]{3,3,5,5,6,7};
        Assert.assertArrayEquals(expect,result);
    }
}
