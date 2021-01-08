package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P189Test {

    @Test
    public void test(){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        P189 p189 = new P189();
        p189.rotate(nums,3);
        int[] expect = new int[]{5,6,7,1,2,3,4};
        Assert.assertArrayEquals(expect,nums);
    }
}
