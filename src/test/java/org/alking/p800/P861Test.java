package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P861Test {

    @Test
    public void test(){
        P861 p861 = new P861();
        int[][] matrix = new int[][]{
                {0,0,1,1},
                {1,0,1,0},
                {1,1,0,0}
        };
        int result = p861.matrixScore(matrix);
        Assert.assertEquals(39,result);
    }
}
