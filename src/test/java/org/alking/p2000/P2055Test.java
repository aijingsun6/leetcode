package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2055Test {

    @Test
    public void test(){
        P2055 p2055 = new P2055();
        String s = "**|**|***|";
        int[][] queries = new int[][]{
                {2,5},
                {5,9}
        };
        int[] result = p2055.platesBetweenCandles(s,queries);
        Assert.assertEquals(2,result.length);
        Assert.assertArrayEquals(new int[]{2,3},result);

        s = "***|**|*****|**||**|*";
        queries = new int[][]{
                {1,17},
                {4,5},
                {14,17},
                {5,11},
                {15,16}
        };
        result = p2055.platesBetweenCandles(s,queries);
        Assert.assertArrayEquals(new int[]{9,0,0,0,0},result);

    }
}
