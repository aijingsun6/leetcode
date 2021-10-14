package org.alking.offerii;

import org.junit.Assert;
import org.junit.Test;

public class O002Test {

    @Test
    public void test(){
        O002 o002 = new O002();
        String s = o002.addBinary("11","10");
        Assert.assertEquals("101",s);

        s = o002.addBinary("1010","1011");
        Assert.assertEquals("10101",s);

    }
}
