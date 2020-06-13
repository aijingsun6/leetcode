package org.alking.array;

import org.junit.Assert;
import org.junit.Test;

public class RotateMatrixTest {

    @Test
    public void rotateTest() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RotateMatrix rm = new RotateMatrix();
        rm.rotate(matrix);


        Assert.assertArrayEquals(new int[]{7,4,1},matrix[0]);
        Assert.assertArrayEquals(new int[]{8,5,2},matrix[1]);
        Assert.assertArrayEquals(new int[]{9,6,3},matrix[2]);

    }
}
