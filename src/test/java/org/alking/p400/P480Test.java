package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P480Test {

    @Test
    public void test() {
        P480 p480 = new P480();
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] result = p480.medianSlidingWindow(nums, k);

        double[] exp = new double[]{1,-1,-1,3,5,6};
        Assert.assertArrayEquals(exp,result,0.001d);

        nums = new int[]{-2147483648,-2147483648,2147483647,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648};
        result = p480.medianSlidingWindow(nums, k);
        exp = new double[]{-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,2147483647,-2147483648};
        Assert.assertArrayEquals(exp,result,0.001d);
        


    }
}
