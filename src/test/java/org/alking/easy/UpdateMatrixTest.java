package org.alking.easy;

import org.junit.Assert;
import org.junit.Test;

public class UpdateMatrixTest {

    @Test
    public void updateMatrixTest(){

        UpdateMatrix um = new UpdateMatrix();
        int[][] matrix = {
                {0 ,0, 0},{0 ,1 ,0},{0, 0, 0}
        };
        int[][] ret = um.updateMatrix(matrix);
        int[][] want = {
                {0 ,0, 0},{0 ,1 ,0},{0, 0, 0}
        };
        Assert.assertArrayEquals(want,ret);

        int[][] matrix2 = {
                {0 ,0, 0},{0 ,1 ,0},{1, 1, 1}
        };
        int[][] want2 = {
                {0 ,0, 0},{0 ,1 ,0},{1, 2, 1}
        };

        ret = um.updateMatrix(matrix2);
        Assert.assertArrayEquals(want2,ret);

        int[][] matrix3 = {
                {0 },{0},{0},{0},{0}
        };
        int[][] want3 = {
                {0 },{0 },{0},{0},{0}
        };
        ret = um.updateMatrix(matrix3);
        Assert.assertArrayEquals(want3,ret);

    }
}
