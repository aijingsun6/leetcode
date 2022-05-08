package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1309Test {

    @Test
    public void test(){
        P1309 p1309 =new P1309();
        String s = "10#11#12";
        String result = p1309.freqAlphabets(s);
        Assert.assertEquals("jkab",result);

        s = "1326#";
        result = p1309.freqAlphabets(s);
        Assert.assertEquals("acz",result);
    }
}
