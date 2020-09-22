package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P31Test {

    @Test
    public void test(){
        P31 p31 = new P31();
        int[] nums = new int[]{1,3,2};
        p31.nextPermutation(nums);
        Assert.assertArrayEquals(new int[]{2,1,3},nums);

        nums = new int[]{5,1,1};
        p31.nextPermutation(nums);
        Assert.assertArrayEquals(new int[]{1,1,5},nums);
    }
}
