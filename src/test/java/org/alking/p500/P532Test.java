package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P532Test {

    @Test
    public void test(){
        P532 p532 = new P532();
        int[] nums = new int[]{3,1,4,1,5};
        int sum = p532.findPairs(nums,2);
        Assert.assertEquals(2,sum);

        sum = p532.findPairs(nums,0);
        Assert.assertEquals(1,sum);

    }
}
