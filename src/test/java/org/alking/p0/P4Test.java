package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P4Test {

    @Test
    public void test(){
        P4 p4 = new P4();
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{1,2,3};
        double ep = 0.001;
        double expect = 2;
        double result = p4.findMedianSortedArrays(nums1,nums2);
        Assert.assertTrue( Math.abs(result-expect) < ep);
    }

    @Test
    public void test2(){
        P4 p4 = new P4();
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double ep = 0.001;
        double expect = 2;
        double result = p4.findMedianSortedArrays(nums1,nums2);
        Assert.assertTrue( Math.abs(result-expect) < ep);
    }
}
