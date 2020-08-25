package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P735Test {

    @Test
    public void test(){
        P735 p735 = new P735();
        int[] input = {5, 10, -5};
        int[] ret = p735.asteroidCollision(input);
        int[] want = {5,10};
        Assert.assertArrayEquals(want,ret);

        input = new int[] {8, -8};
        want = new int[0];
        ret = p735.asteroidCollision(input);
        Assert.assertArrayEquals(want,ret);

        input = new int[] {10, 2, -5};
        want = new int[]{10};
        ret = p735.asteroidCollision(input);
        Assert.assertArrayEquals(want,ret);

        input = new int[] {-2, -1, 1, 2};
        want = new int[]{-2, -1, 1, 2};
        ret = p735.asteroidCollision(input);
        Assert.assertArrayEquals(want,ret);

    }
}
