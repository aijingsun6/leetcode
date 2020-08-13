package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P392Test {

    @Test
    public void test(){
        P392 p392 = new P392();
        Assert.assertTrue(p392.isSubsequence("abc","ahbgdc"));
        Assert.assertFalse(p392.isSubsequence("axc","ahbgdc"));
    }
}
