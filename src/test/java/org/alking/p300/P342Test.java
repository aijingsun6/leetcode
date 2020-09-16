package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P342Test {

    @Test
    public void test(){
        P342 p342 = new P342();
        Assert.assertFalse(p342.isPowerOfFour(5));
    }
}
