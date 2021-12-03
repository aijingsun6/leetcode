package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1005Test {
    @Test
    public void test(){
        P1005 p1005 = new P1005();
        int[] arr = new int[]{4,2,3};
        int k = 1;
        int result = p1005.largestSumAfterKNegations(arr,k);
        Assert.assertEquals(5,result);

        arr = new int[]{3,-1,0,2};
        k = 3;
        result = p1005.largestSumAfterKNegations(arr,k);
        Assert.assertEquals(6,result);

        arr = new int[]{2,-3,-1,5,-4};
        k = 2;
        result = p1005.largestSumAfterKNegations(arr,k);
        Assert.assertEquals(13,result);
    }
}
