package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P840Test {

    @Test
    public void test(){

        P840 p840 = new P840();
        int[][] grid = {
                {4,3,8,4},
                {9,5,1,9},
                {2,7,6,2}
        };
        int ret = p840.numMagicSquaresInside(grid);
        Assert.assertEquals(1, ret);
    }
}
