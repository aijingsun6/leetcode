package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1711Test {

    @Test
    public void test(){
        P1711 p1711 = new P1711();
        int[] deliciousness = new int[]{1,3,5,7,9};
        int result = p1711.countPairs(deliciousness);
        int expect = 4;
        Assert.assertEquals(expect,result);

        deliciousness = new int[]{1,1,1,3,3,3,7};
        result = p1711.countPairs(deliciousness);
        expect = 15;
        Assert.assertEquals(expect,result);

        deliciousness = new int[]{64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64,64};
        result = p1711.countPairs(deliciousness);
        expect = 528;
        Assert.assertEquals(expect,result);

    }
}
