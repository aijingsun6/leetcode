package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P20Test {

    @Test
    public void test(){
        P20 p20 = new P20();
        Assert.assertTrue(p20.isValid("()"));
        Assert.assertTrue(p20.isValid("()[]{}"));
        Assert.assertTrue(p20.isValid("{[]}"));
    }
}
