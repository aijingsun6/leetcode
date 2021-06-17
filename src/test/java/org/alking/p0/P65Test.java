package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P65Test {

    @Test
    public void test(){
        P65 p65 = new P65();
        String s = "2";
        boolean result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "0089";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "-2";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "-0.1";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "-.9";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "2e10";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "-90E3";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "3e+7";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "+6e-1";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s  = "-123.456e789";
        result = p65.isNumber(s);
        Assert.assertTrue(result);

        s = "95a54e53";
        result = p65.isNumber(s);
        Assert.assertFalse(result);
    }
}
