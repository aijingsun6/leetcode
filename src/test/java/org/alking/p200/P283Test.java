package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P283Test {

    @Test
    public void test(){
        P283 p283 = new P283();
        int[] nums = new int[]{0,1,0,3,12};
        p283.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1,3,12,0,0},nums);
    }
}
