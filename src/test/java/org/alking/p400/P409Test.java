package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P409Test {

    @Test
    public void test(){
        P409 p409 = new P409();
        Assert.assertTrue( 7 == p409.longestPalindrome("abccccdd"));

    }
}
