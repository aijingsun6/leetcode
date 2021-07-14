package org.alking.p1800;

import org.junit.Assert;
import org.junit.Test;

public class P1818Test {

    @Test
    public void test(){
        P1818 p1818 = new P1818();
        int[] nums1 = new int[]{1,7,5};
        int[] nums2 = new int[]{2,3,5};
        int result = p1818.minAbsoluteSumDiff(nums1,nums2);
        int expect = 3;
        Assert.assertEquals(expect,result);

        nums1 = new int[]{2,4,6,8,10};
        nums2 = new int[]{2,4,6,8,10};
        result = p1818.minAbsoluteSumDiff(nums1,nums2);
        expect = 0;
        Assert.assertEquals(expect,result);


        nums1 = new int[]{1,10,4,4,2,7};
        nums2 = new int[]{9,3,5,1,7,4};
        result = p1818.minAbsoluteSumDiff(nums1,nums2);
        expect = 20;
        Assert.assertEquals(expect,result);

        nums1 = new int[]{1,28,21};
        nums2 = new int[]{9,21,20};
        result = p1818.minAbsoluteSumDiff(nums1,nums2);
        expect = 9;
        Assert.assertEquals(expect,result);

    }
}
