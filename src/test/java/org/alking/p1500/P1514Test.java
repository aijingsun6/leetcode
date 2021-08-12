package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1514Test {

    @Test
    public void test() {
        P1514 p1514 = new P1514();
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[]{0.5, 0.5, 0.2};
        int start = 0;
        int end = 2;
        double result = p1514.maxProbability(n,edges,succProb,start,end);
        Assert.assertEquals(0.25d,result,0.00001d);

        n = 3;
        edges = new int[][]{{0, 1}, {1, 2}, {0, 2}};
        succProb = new double[]{0.5,0.5,0.3};
        start = 0;
        end = 2;
        result = p1514.maxProbability(n,edges,succProb,start,end);
        Assert.assertEquals(0.3d,result,0.00001d);

        n = 3;
        edges = new int[][]{{0, 1}};
        succProb = new double[]{0.5};
        start = 0;
        end = 2;
        result = p1514.maxProbability(n,edges,succProb,start,end);
        Assert.assertEquals(0.0d,result,0.00001d);
    }
}
