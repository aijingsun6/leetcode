package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1716Test {

    @Test
    public void test(){
        P1716 p1716 = new P1716();
        int n = 4;
        int exp  = 10;
        int result = p1716.totalMoney(n);
        Assert.assertEquals(exp,result);

        n = 10;
        exp = 37;
        result = p1716.totalMoney(n);
        Assert.assertEquals(exp,result);

    }
}
