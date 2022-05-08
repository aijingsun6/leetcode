package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P13Test {

    @Test
    public void test(){
        P13 p13 = new P13();
        String s = "III";
        int result = p13.romanToInt(s);
        int expect = 3;
        Assert.assertEquals(expect,result);

        s = "IV";
        result = p13.romanToInt(s);
        expect = 4;
        Assert.assertEquals(expect,result);

        s = "IX";
        result = p13.romanToInt(s);
        expect = 9;
        Assert.assertEquals(expect,result);

        s = "LVIII";
        result = p13.romanToInt(s);
        expect = 58;
        Assert.assertEquals(expect,result);

        s = "MCMXCIV";
        result = p13.romanToInt(s);
        expect = 1994;
        Assert.assertEquals(expect,result);
    }
}
