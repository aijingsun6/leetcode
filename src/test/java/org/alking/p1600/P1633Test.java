package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1633Test {

    @Test
    public void test() {

        P1633 p1633 = new P1633();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result = p1633.spiralOrder(matrix);
        Assert.assertArrayEquals(new int[]{1,2,3,6,9,8,7,4,5},result);

        matrix = new int[][]{{1}};
        result = p1633.spiralOrder(matrix);

    }
}
