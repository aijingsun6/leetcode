package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P279Test {

    @Test
    public void test(){
        P279 p279 = new P279();
        int n = 12;
        int result = p279.numSquares(n);
        int expect = 3;
        Assert.assertEquals(expect,result);

        n = 13;
        result = p279.numSquares(n);
        expect = 2;
        Assert.assertEquals(expect,result);
    }
}
