package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P542Test {

    @Test
    public void test() {
        P542 p542 = new P542();
        int[][] matrix = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] acc = p542.updateMatrix(matrix);
        int[][] expect = new int[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 2, 1}
        };
        Assert.assertArrayEquals(expect, acc);


        matrix = new int[][]{
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 1, 0, 1, 0, 1, 1}
        };

        acc = p542.updateMatrix(matrix);
        expect = new int[][]{
                {2, 1, 0, 1, 2, 2, 2, 3, 3, 2},
                {2, 1, 0, 1, 1, 1, 1, 2, 2, 1},
                {3, 2, 1, 1, 0, 0, 0, 1, 1, 0},
                {2, 1, 1, 2, 1, 1, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 1, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                {0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 2, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 1, 0, 1, 0, 1, 2}
        };

        Assert.assertArrayEquals(expect, acc);


    }
}
