package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1001Test {

    @Test
    public void test(){
        P1001 p1001 = new P1001();
        int n = 5;
        int[][] lamps = new int[][]{{0,0},{4,4}};
        int[][] queries = new int[][]{{1,1},{1,0}};
        int[] result = p1001.gridIllumination(n,lamps,queries);
        Assert.assertEquals(1,result[0]);
        Assert.assertEquals(0,result[1]);
    }
}
