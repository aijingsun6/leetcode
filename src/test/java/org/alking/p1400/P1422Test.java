package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1422Test {

    @Test
    public void test(){
        P1422 p1422 = new P1422();
        String s = "011101";
        int result = p1422.maxScore(s);
        Assert.assertEquals(5, result);
        s = "00111";
        result = p1422.maxScore(s);
        Assert.assertEquals(5, result);

        s = "00";
        result = p1422.maxScore(s);
        Assert.assertEquals(2, result);


    }
}
