package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1636Test {

    @Test
    public void test(){
        P1636 p1636 = new P1636();
        int[] nums = new int[]{1,1,2,2,2,3};
        int[] result = p1636.frequencySort(nums);
        int[] exp = new int[]{3,1,1,2,2,2};
        Assert.assertArrayEquals(exp,result);
    }
}
