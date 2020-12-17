package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P714Test {

    @Test
    public void test(){
        P714 p714  = new P714();
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        int fee = 2;
        int profit = p714.maxProfit(prices,fee);
        Assert.assertEquals(8,profit);
    }
}
