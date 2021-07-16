package org.alking.offer;

import org.junit.Assert;
import org.junit.Test;

public class O53Test {

    @Test
    public void test(){
        O53 o53 = new O53();
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        int result = o53.search(nums,target);
        int expect = 2;
        Assert.assertEquals(expect,result);

        target = 6;
        result = o53.search(nums,target);
        expect = 0;
        Assert.assertEquals(expect,result);

        nums = new int[]{1};
        target = 1;
        result = o53.search(nums,target);
        expect = 1;
        Assert.assertEquals(expect,result);

        nums = new int[]{2,2};
        target = 2;
        result = o53.search(nums,target);
        expect = 2;
        Assert.assertEquals(expect,result);

    }
}
