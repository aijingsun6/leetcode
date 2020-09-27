package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P88Test {

    @Test
    public void test(){
        P88 p88 = new P88();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        p88.merge(nums1,3,nums2,3);
        int[] result = new int[]{1,2,2,3,5,6};
        Assert.assertArrayEquals(result,nums1);

        nums1 = new int[]{2,0};
        nums2 = new int[]{1};
        p88.merge(nums1,1,nums2,1);
        result = new int[]{1,2};
        Assert.assertArrayEquals(result,nums1);

    }
}
