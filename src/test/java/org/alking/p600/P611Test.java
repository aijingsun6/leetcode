package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P611Test {

    @Test
    public void test(){
        P611 p611 = new P611();
        int[] nums = new int[]{2,2,3,4};
        int result = p611.triangleNumber(nums);
        Assert.assertEquals(3,result);

        nums = new int[]{5,5,5};
        result = p611.triangleNumber(nums);
        Assert.assertEquals(1,result);

        nums = new int[]{5,5,5,5};
        result = p611.triangleNumber(nums);
        Assert.assertEquals(4,result);
    }
}
