package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    @Test
    public void maxProfitTest(){
        int[] arr = {7,1,5,3,6,4};
        MaxProfit maxProfit = new MaxProfit();
        Assert.assertEquals(7, maxProfit.maxProfit(arr));
        arr = new int[]{1,2,3,4,5};
        Assert.assertEquals(4, maxProfit.maxProfit(arr));
    }
}
