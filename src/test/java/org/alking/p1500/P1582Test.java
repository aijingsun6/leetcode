package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1582Test {

    @Test
    public void test(){
        P1582 p1582 = new P1582();

        int[][] mat = new int[][]{
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };

        int result = p1582.numSpecial(mat);
        Assert.assertEquals(1, result);

    }
}
