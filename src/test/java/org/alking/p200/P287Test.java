package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P287Test {

    @Test
    public void test(){
        P287 p287  = new P287();
        int[] nums = new int[]{1,3,4,2,2};
        int n = p287.findDuplicate(nums);
        Assert.assertEquals(2,n);
        nums = new int[]{3,1,3,4,2};
        n = p287.findDuplicate(nums);
        Assert.assertEquals(3,n);

    }
}
