package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1736Test {

    @Test
    public void test(){
        P1736 p1736 = new P1736();
        Assert.assertEquals("23:50",p1736.maximumTime("2?:?0"));
        Assert.assertEquals("09:39",p1736.maximumTime("0?:3?"));
        Assert.assertEquals("19:22",p1736.maximumTime("1?:22"));
    }
}
