package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

public class P149Test {

    @Test
    public void test(){

        P149 p149 = new P149();
        int[][] points = new int[][]{
                {1,1},
                {2,2},
                {3,3}
        };
        int result = p149.maxPoints(points);
        int expect = 3;
        Assert.assertEquals(expect,result);

        points = new int[][]{
                {1,1},{3,2},{5,3},{4,1},{2,3},{1,4}
        };
        result = p149.maxPoints(points);
        expect = 4;
        Assert.assertEquals(expect,result);
    }
}
