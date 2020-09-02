package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1587Test {

    @Test
    public void test(){

        P1587 p1587 = new P1587();
        int[][] mat = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 5;
        Assert.assertTrue(p1587.findNumberIn2DArray(mat,target));
    }
}
