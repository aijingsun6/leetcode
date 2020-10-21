package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P925Test {
    @Test
    public void test(){
        P925 p925 = new P925();
        Assert.assertTrue(p925.isLongPressedName("alex","aaleex"));
        Assert.assertFalse(p925.isLongPressedName("saeed","ssaaedd"));
        //"dfuyalc"
        //"fuuyallc"

    }
}
