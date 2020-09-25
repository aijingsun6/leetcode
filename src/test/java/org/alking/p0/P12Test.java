package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P12Test {

    @Test
    public void test(){
        P12 p12 = new P12();
        Assert.assertEquals("III",p12.intToRoman(3));
        Assert.assertEquals("IV",p12.intToRoman(4));
        Assert.assertEquals("MCMXCIV",p12.intToRoman(1994));
    }
}
