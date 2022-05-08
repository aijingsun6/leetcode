package org.alking.offer;

import org.junit.Assert;
import org.junit.Test;

public class O11Test {

    @Test
    public void test(){
        O11 o11 = new O11();
        int[] nums = new int[]{3,4,5,1,2};
        int result = o11.minArray(nums);
        int expect = 1;
        Assert.assertEquals(expect,result);

        nums = new int[]{2,2,2,0,1};
        result = o11.minArray(nums);
        expect = 0;
        Assert.assertEquals(expect,result);


        nums = new int[]{1,1,1,1,1};
        result = o11.minArray(nums);
        expect = 1;
        Assert.assertEquals(expect,result);

        nums = new int[]{3,1,3,3};
        result = o11.minArray(nums);
        expect = 1;
        Assert.assertEquals(expect,result);

    }
}
