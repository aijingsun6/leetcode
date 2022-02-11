package org.alking.p1900;

import org.junit.Assert;
import org.junit.Test;

public class P1984Test {

    @Test
    public void test() {

        P1984 p1984 = new P1984();
        int[] nums = new int[]{90};
        int k = 1;
        int res = p1984.minimumDifference3(nums,k);
        Assert.assertEquals(0,res);

        nums = new int[]{1,4,7,9};
        k= 2;
        res = p1984.minimumDifference3(nums,k);
        Assert.assertEquals(2,res);

    }
}
