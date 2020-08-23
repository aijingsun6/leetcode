package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1399Test {

    @Test
    public void test(){
        P1399 p1399 = new P1399();
        int ret = p1399.countLargestGroup(2);
        Assert.assertEquals(2,ret);
    }
}
