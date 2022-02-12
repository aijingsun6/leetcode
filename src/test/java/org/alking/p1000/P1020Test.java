package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1020Test {

    @Test
    public void test(){
        P1020 p1020 = new P1020();
        int[][] grid = new int[][]{
                {0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}
        };
        int res = p1020.numEnclaves(grid);
        Assert.assertEquals(3,res);

        grid = new int[][]{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        res = p1020.numEnclaves(grid);
        Assert.assertEquals(0,res);
    }
}
