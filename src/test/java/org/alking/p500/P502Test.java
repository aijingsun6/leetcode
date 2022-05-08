package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P502Test {

    P502 p502 = new P502();

    private int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        return p502.findMaximizedCapital_V2(k,w,profits,capital);
    }

    @Test
    public void test(){
        P502 p502 = new P502();
        int k = 2;
        int w = 0;
        int[] profits = new int[]{1,2,3};
        int[] capital = new int[]{0,1,1};
        int result = findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(4,result);

        k = 3;
        w = 0;
        profits = new int[]{1,2,3};
        capital = new int[]{0,1,2};
        result = findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(6,result);


        k = 1;
        w = 2;
        profits = new int[]{1,2,3};
        capital = new int[]{1,1,2};
        result = findMaximizedCapital(k,w,profits,capital);
        Assert.assertEquals(5,result);


    }
}
