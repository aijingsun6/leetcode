package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1331Test {

    @Test
    public void test(){
        P1331 p1331 = new P1331();
        Assert.assertArrayEquals(new int[]{4,1,2,3},p1331.arrayRankTransform(new int[]{40,10,20,30}));
    }
}
