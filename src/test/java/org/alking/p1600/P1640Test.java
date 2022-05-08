package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1640Test {

    @Test
    public void test() {
        P1640 p1640 = new P1640();
        int[] array = new int[]{15, 88};
        int[][] pieces = new int[][]{
                {88},
                {15}
        };
        boolean result = p1640.canFormArray(array,pieces);
        Assert.assertTrue(result);

        array = new int[]{91,4,64,78};

        pieces = new int[][]{
                {78},
                {4,64},
                {91}
        };
        result = p1640.canFormArray(array,pieces);
        Assert.assertTrue(result);

        array = new int[]{1,3,5,7};

        pieces = new int[][]{
                {2},
                {4,6},
                {8}
        };
        result = p1640.canFormArray(array,pieces);
        Assert.assertTrue(!result);
    }
}
