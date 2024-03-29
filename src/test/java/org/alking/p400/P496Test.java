package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P496Test {

    @Test
    public void test(){
        P496 p496 = new P496();
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        int[] res = p496.nextGreaterElement2(nums1,nums2);
        Assert.assertArrayEquals(new int[]{-1,3,-1},res);

        nums1 = new int[]{2,4};
        nums2 = new int[]{1,2,3,4};
        res = p496.nextGreaterElement2(nums1,nums2);
        Assert.assertArrayEquals(new int[]{3,-1},res);
    }
}
