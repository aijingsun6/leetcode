package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P502Test {

    @Test
    public void test(){
        P502 p502 = new P502();
        int k = 2;
        int w = 0;
        int[] profits = new int[]{1,2,3};
        int[] capital = new int[]{0,1,1};
        int result = p502.findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(4,result);

        k = 3;
        w = 0;
        profits = new int[]{1,2,3};
        capital = new int[]{0,1,2};
        result = p502.findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(6,result);


        k = 1;
        w = 2;
        profits = new int[]{1,2,3};
        capital = new int[]{1,1,2};
        result = p502.findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(5,result);


    }
}
