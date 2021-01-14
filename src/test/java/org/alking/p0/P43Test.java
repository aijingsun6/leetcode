package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P43Test {

    @Test
    public void multiplyTest(){
        P43 p43 = new P43();
        Assert.assertEquals("121", p43.multiply("11","11"));
        Assert.assertEquals("56088", p43.multiply("123","456"));
    }
}
