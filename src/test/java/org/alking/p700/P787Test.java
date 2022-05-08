package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P787Test {

    @Test
    public void testFindCheapestPriceBellman(){

        int[][] edges = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        int n = 3;
        int src = 0;
        int dst = 2;
        int k = 1;
        P787 p787 = new P787();
        int result  = p787.findCheapestPriceBellman(n,edges,src,dst,k);
        Assert.assertEquals(200,result);

        k = 0;
        result  = p787.findCheapestPriceBellman(n,edges,src,dst,k);
        Assert.assertEquals(500,result);
    }
}
