package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2027Test {

    @Test
    public void test(){
        P2027 p2027 = new P2027();
        String s = "XXX";
        int r = p2027.minimumMoves(s);
        Assert.assertEquals(1,r);
        s = "XXOX";
        r = p2027.minimumMoves(s);
        Assert.assertEquals(2,r);

    }
}
