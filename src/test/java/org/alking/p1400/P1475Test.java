package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1475Test {

    @Test
    public void test() {
        P1475 p1475 = new P1475();
        int[] prices = new int[]{8, 4, 6, 2, 3};
        int[] ret = p1475.finalPrices(prices);
        Assert.assertArrayEquals(new int[]{4,2,4,2,3},ret);

    }
}
