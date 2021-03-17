package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P80Test {

    @Test
    public void test(){
        P80 p80 = new P80();
        int[] nums = new int[]{1,1,1,2,2,3};
        int result = p80.removeDuplicates(nums);
        Assert.assertEquals(5,result);

    }
}
