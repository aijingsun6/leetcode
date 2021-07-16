package org.alking.offer;

import org.junit.Assert;
import org.junit.Test;

public class O14ITest {

    @Test
    public void test(){

        O14I o14I = new O14I();
        int result;
        int expect;
        result = o14I.cuttingRope(2);
        expect = 1;
        Assert.assertEquals(expect,result);

        result = o14I.cuttingRope(8);
        expect = 18;
        Assert.assertEquals(expect,result);

        result = o14I.cuttingRope(10);
        expect = 36;
        Assert.assertEquals(expect,result);


    }
}
