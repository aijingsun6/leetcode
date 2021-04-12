package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P240Test {

    @Test
    public void test(){
        P240 p240 = new P240();

        int[][] matrix = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        boolean result = p240.searchMatrix(matrix,target);
        Assert.assertTrue(result);
    }
}
