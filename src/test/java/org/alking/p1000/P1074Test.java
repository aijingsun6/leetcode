package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1074Test {

    @Test
    public void test(){
        P1074 p1074 = new P1074();
        int[][] matrix = new int[][]{
                {0,1,0},
                {1,1,1},
                {0,1,0}
        };
        int target = 0;
        int result = p1074.numSubmatrixSumTarget(matrix,target);
        Assert.assertEquals(4,result);

        matrix = new int[][]{
                {1,-1},
                {-1,1}
        };
        target = 0;
        result = p1074.numSubmatrixSumTarget(matrix,target);
        Assert.assertEquals(5,result);
    }
}
