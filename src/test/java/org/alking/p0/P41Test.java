package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P41Test {

    @Test
    public void test(){
        P41 p41 = new P41();
        int res = p41.firstMissingPositive(new int[]{1,2,0});
        Assert.assertEquals(3, res);

        res = p41.firstMissingPositive(new int[]{3,4,-1,1});
        Assert.assertEquals(2, res);

        res = p41.firstMissingPositive(new int[]{7,8,9,11,12});
        Assert.assertEquals(1, res);

        res = p41.firstMissingPositive(new int[]{2,1});
        Assert.assertEquals(3, res);
    }
}
