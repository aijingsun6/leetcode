package org.alking.p1200;

import org.junit.Assert;
import org.junit.Test;

public class P1218Test {

    @Test
    public void test(){
        P1218 p1218 = new P1218();
        int[] arr = new int[]{1,3,5,7,9};
        int diff = 2;
        int result = p1218.longestSubsequence(arr,diff);
        Assert.assertEquals(5,result);

        arr = new int[]{1,5,7,8,5,3,4,2,1};
        diff = -2;
        result = p1218.longestSubsequence(arr,diff);
        Assert.assertEquals(4,result);

    }
}
