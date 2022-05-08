package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P560Test {

    @Test
    public void test(){
        P560 p560 = new P560();
        int[] nums = new int[]{1,1,1};
        int k = 2;
        int result = p560.subarraySum(nums,k);
        Assert.assertEquals(2,result);
    }
}
