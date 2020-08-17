package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P299Test {

    @Test
    public void test(){
        P299 p299 = new P299();
        Assert.assertEquals("1A3B",p299.getHint("1807","7810"));
    }
}
