package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1461Test {

    @Test
    public void test() {
        P1461 p1461 = new P1461();

        String  s = "00110110";
        int k = 2;
        boolean result = p1461.hasAllCodes(s,k);
        Assert.assertTrue(result);

        s = "11001";
        k = 1;
        result = p1461.hasAllCodes(s,k);
        Assert.assertTrue(result);
    }
}
