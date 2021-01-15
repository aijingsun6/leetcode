package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P947Test {

    @Test
    public void test() {
        P947 p947 = new P947();
        int[][] stones = new int[][]{
                {0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}
        };

        int result = p947.removeStones(stones);
        Assert.assertEquals(5, result);
    }
}
