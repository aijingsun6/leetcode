package org.alking.queue;

import org.junit.Assert;
import org.junit.Test;

public class NumSquaresTest {

    @Test
    public void test(){
        NumSquares ns = new NumSquares();
        Assert.assertEquals(3,ns.numSquares(12));
        Assert.assertEquals(2,ns.numSquares(13));
        Assert.assertEquals(4,ns.numSquares(7168));
    }
}
