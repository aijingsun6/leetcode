package org.alking.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    @Test

    public void maxProfitTest(){
        org.alking.dp.MaxProfit maxProfit = new MaxProfit();
        int[] arr = {7,1,5,3,6,4};
        Assert.assertEquals(5, maxProfit.maxProfit(arr));
        arr = new int[]{1,2,3,4,5};
        Assert.assertEquals(4, maxProfit.maxProfit(arr));
        arr = new int[]{2,1,4};
        Assert.assertEquals(3, maxProfit.maxProfit(arr));

    }
}
