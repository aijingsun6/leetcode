package org.alking.offer;

import org.junit.Assert;
import org.junit.Test;

public class O51Test {

    @Test
    public void test(){
        O51 o51 = new O51();
        int[] nums = new int[]{7,5,6,4};
        int result = o51.reversePairs(nums);
        Assert.assertEquals(5,result);
    }
}
