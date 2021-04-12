package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P91Test {

    @Test
    public void test(){

        P91 p91 = new P91();
        String s = "12";
        int result = p91.numDecodings(s);
        Assert.assertEquals(2, result);

        s = "226";
        result = p91.numDecodings(s);
        Assert.assertEquals(3, result);

        s = "0";
        result = p91.numDecodings(s);
        Assert.assertEquals(0, result);

        s = "99";
        result = p91.numDecodings(s);
        Assert.assertEquals(1, result);

        s = "2101";
        result = p91.numDecodings(s);
        Assert.assertEquals(1, result);

        s = "1201234";
        result = p91.numDecodings(s);
        Assert.assertEquals(3, result);

        s = "27";
        result = p91.numDecodings(s);
        Assert.assertEquals(1, result);

    }
}
