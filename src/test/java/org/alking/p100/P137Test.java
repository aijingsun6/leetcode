package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P137Test {

    @Test
    public void test(){
        P137 p137 = new P137();
        int[] nums  = new int[]{2,2,2,3};
        int result = p137.singleNumber(nums);
        Assert.assertEquals(3,result);

        nums = new int[]{0,1,0,1,0,1,99};
        result = p137.singleNumber(nums);
        Assert.assertEquals(99,result);

        nums = new int[]{-2,-2,1,1,4,1,4,4,-4,-2};
        result = p137.singleNumber(nums);
        Assert.assertEquals(-4,result);

    }
}
