package org.alking.p1200;

import org.junit.Assert;
import org.junit.Test;

public class P1269Test {

    @Test
    public void test(){
        P1269 p1269 = new P1269();
        int steps = 3;
        int arrLen = 2;
        int result = p1269.numWays2(steps,arrLen);
        Assert.assertEquals(4, result);

        steps = 2;
        arrLen = 4;
        result = p1269.numWays2(steps,arrLen);
        Assert.assertEquals(2, result);

        steps = 4;
        arrLen = 2;
        result = p1269.numWays2(steps,arrLen);
        Assert.assertEquals(8, result);

        steps = 4;
        arrLen = 3;
        result = p1269.numWays2(steps,arrLen);
        Assert.assertEquals(9, result);

        steps = 27;
        arrLen = 7;
        result = p1269.numWays2(steps,arrLen);
        Assert.assertEquals(127784505, result);

    }
}
