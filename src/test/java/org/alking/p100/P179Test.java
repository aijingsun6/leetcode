package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P179Test {

    @Test
    public void test(){
        P179 p179 = new P179();
        int[] nums = new int[]{3,30,34,5,9};
        String result = p179.largestNumber(nums);
        Assert.assertEquals("9534330",result);

        nums = new int[]{0,0};
        result = p179.largestNumber(nums);
        Assert.assertEquals("0",result);
    }
}
