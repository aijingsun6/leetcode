package org.alking.leetcode.p2500;

import org.junit.Assert;
import org.junit.Test;

public class P2516Test {

    @Test
    public void test(){
        P2516 p2516 = new P2516();
        String s= "aabaaaacaabc";
        int k = 2;
        int r = p2516.takeCharacters(s,k);
        int e = 8;
        Assert.assertEquals(e, r);

        s = "aa";
        k = 2;
        r = p2516.takeCharacters(s,k);
        e = -1;
        Assert.assertEquals(e, r);
    }
}
