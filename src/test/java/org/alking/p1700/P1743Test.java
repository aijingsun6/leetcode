package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1743Test {

    @Test
    public void test(){
        P1743 p1743 = new P1743();
        int[][] adjacentPairs = new int[][]{
                {2,1},
                {3,4},
                {3,2}
        };

        int[] result = p1743.restoreArray(adjacentPairs);
        int[] expect = new int[]{1,2,3,4};
        Assert.assertArrayEquals(expect,result);
    }
}
