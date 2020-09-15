package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P414Test {

    @Test
    public void test(){
        P414 p414 = new P414();
        int[] nums = new int[]{1,2,3,4,5,6};
        int v = p414.thirdMax(nums);
        Assert.assertEquals(4, v);

        nums = new int[]{2,2,3,1};
        v = p414.thirdMax(nums);
        Assert.assertEquals(1, v);
    }
}
