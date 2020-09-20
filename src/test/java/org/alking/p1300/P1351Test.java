package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1351Test {

    @Test
    public void test(){
        P1351 p1351 = new P1351();
        int[][] grid = new int[][]{
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int res = p1351.countNegatives(grid);
        Assert.assertEquals(8, res);

    }
}
