package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P375Test {

    @Test
    public void test(){
        P375 p375 = new P375();
        int result = p375.getMoneyAmount(10);
        Assert.assertEquals(16,result);
    }
}
