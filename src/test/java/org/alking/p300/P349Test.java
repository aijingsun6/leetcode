package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P349Test {

    @Test
    public void test() {

        P349 p349 = new P349();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{2,1};
        int[] ret = p349.intersection(nums1,nums2);
        Assert.assertArrayEquals(new int[]{1,2},ret);
    }
}
