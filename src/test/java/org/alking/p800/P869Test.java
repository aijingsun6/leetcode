package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P869Test {

    @Test
    public void test(){
        P869 p869 = new P869();
        Assert.assertTrue(p869.reorderedPowerOf2(1));
        Assert.assertTrue(p869.reorderedPowerOf2(16));
        Assert.assertTrue(p869.reorderedPowerOf2(46));

        Assert.assertFalse(p869.reorderedPowerOf2(10));
    }
}
