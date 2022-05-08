package org.alking.p1800;

import org.junit.Assert;
import org.junit.Test;

public class P1838Test {

    @Test
    public void test(){
        P1838 p1838 = new P1838();
        int[] nums = new int[]{1,2,4};
        int k = 5;
        int result = p1838.maxFrequency(nums,k);
        Assert.assertEquals(3,result);

        nums = new int[]{1,4,8,13};
        k = 5;
        result = p1838.maxFrequency(nums,k);
        Assert.assertEquals(2,result);

        nums = new int[]{1,5,5,7};
        k = 2;
        result = p1838.maxFrequency(nums,k);
        Assert.assertEquals(2,result);
    }
}
