package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P423Test {

    @Test
    public void test(){

        P423 p423 = new P423();
        String s = "owoztneoer";
        String result = p423.originalDigits(s);
        Assert.assertEquals("012",result);

        s = "fviefuro";
        result = p423.originalDigits(s);
        Assert.assertEquals("45",result);

        s = "zeroonetwothreefourfivesixseveneightnine";
        result = p423.originalDigits(s);
        Assert.assertEquals("0123456789",result);
    }
}
