package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P162Test {

    @Test
    public void test(){
        P162 p162 = new P162();
        int[] nums = new int[]{2,1};
        int result = p162.findPeakElement(nums);
        Assert.assertEquals(0,result);
    }
}
