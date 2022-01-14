package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P373Test {

    @Test
    public void test() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        int k = 3;
        P373 p373 = new P373();

        List<List<Integer>> r = p373.kSmallestPairs(nums1,nums2,k);
        Assert.assertEquals(2,r.size());

        nums1 = new int[]{1,7,11};
        nums2 = new int[]{2,4,6};
        k = 3;
        r = p373.kSmallestPairs(nums1,nums2,k);
        Assert.assertEquals(3,r.size());




    }
}
