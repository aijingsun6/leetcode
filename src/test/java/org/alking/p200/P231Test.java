package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P231Test {

    @Test
    public void test(){
        P231 p231 = new P231();
        boolean result = p231.isPowerOfTwo(2);
        Assert.assertTrue(result);
    }
}
