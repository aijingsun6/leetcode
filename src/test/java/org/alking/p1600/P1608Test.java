package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1608Test {

    @Test
    public void test(){
        int[] nums = new int[]{3,5};
        P1608 p1608 = new P1608();
        int res = p1608.specialArray(nums);
        Assert.assertEquals(2,res);
    }
}
