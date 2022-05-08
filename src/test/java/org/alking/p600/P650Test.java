package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P650Test {
    @Test
    public void test(){
        P650 p650 = new P650();
        int n = 18;
        int result = p650.minSteps(n);
        Assert.assertEquals(8,result);
    }
}
