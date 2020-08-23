package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P696Test {

    @Test
    public void test(){
        P696 p696 = new P696();
        String s = "00110011";
        Assert.assertEquals(6, p696.countBinarySubstrings(s));
    }
}
