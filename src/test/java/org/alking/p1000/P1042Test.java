package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1042Test {

    @Test
    public void test() {
        P1042 p1042 = new P1042();
        int n = 3;
        int[][] paths = new int[][]{{1,2},{2,3},{3,1}};
        int[] colors = p1042.gardenNoAdj(n,paths);
        Assert.assertEquals(n,colors.length);

        n = 4;
        paths = new int[][]{{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
        colors = p1042.gardenNoAdj(n,paths);
        Assert.assertEquals(n,colors.length);


    }
}
