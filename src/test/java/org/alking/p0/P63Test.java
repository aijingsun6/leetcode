package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P63Test {

    @Test
    public void test(){
        P63 p63 = new P63();
        int[][] grid = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int result = p63.uniquePathsWithObstacles(grid);
        int expect = 2;
        Assert.assertEquals(expect,result);

        grid = new int[][]{
                {0}
        };

        result = p63.uniquePathsWithObstacles(grid);
        expect = 1;
        Assert.assertEquals(expect,result);

    }
}
