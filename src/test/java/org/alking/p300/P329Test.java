package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P329Test {

    @Test
    public void test(){
        P329 p329 = new P329();
        int[][] matrix = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        int result = p329.longestIncreasingPath(matrix);
        Assert.assertEquals(4,result);

        matrix = new int[][]{{3,4,5},{3,2,6},{2,2,1}};
        result = p329.longestIncreasingPath(matrix);
        Assert.assertEquals(4,result);


        matrix = new int[][]{{1,2}};
        result = p329.longestIncreasingPath(matrix);
        Assert.assertEquals(2,result);


        matrix = new int[][]{{0},{1},{5},{5}};
        result = p329.longestIncreasingPath(matrix);
        Assert.assertEquals(3,result);
    }
}
