package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P367Test {

    @Test
    public void test(){
        P367 p367 = new P367();
        Assert.assertTrue(p367.isPerfectSquare(10000));
        Assert.assertTrue(p367.isPerfectSquare(808201));
    }
}
