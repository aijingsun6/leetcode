package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1417Test {

    @Test
    public void test(){
        P1417 p1417 = new P1417();
        String s = "a0b1c2";
        String result = p1417.reformat(s);
        Assert.assertEquals("0a1b2c",result);
    }
}
