package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P50Test {

    @Test
    public void test(){
        P50 p50 = new P50();

        double x = 2.0d;
        int n = 10;
        double result = p50.myPow(x,n);
        double expect = 1024;
        Assert.assertTrue(Math.abs(expect-result) < 0.001d);

        x = 2.1d;
        n = 3;
        result = p50.myPow(x,n);
        expect = 9.261d;
        Assert.assertTrue(Math.abs(expect-result) < 0.001d);

        x = 0.0001;
        n = 2147483647;
        result = p50.myPow(x,n);
        expect = 0.0d;
        Assert.assertTrue(Math.abs(expect-result) < 0.001d);

        x = 2.0;
        n = -2147483648;
        result = p50.myPow(x,n);
        expect = 0.0d;
        Assert.assertTrue(Math.abs(expect-result) < 0.001d);
    }
}
