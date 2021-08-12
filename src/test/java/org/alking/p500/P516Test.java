package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P516Test {

    @Test
    public void test(){

        P516 p516 = new P516();
        String s = "bbbab";
        int result = p516.longestPalindromeSubseq(s);
        Assert.assertEquals(4,result);

        s = "cbbd";
        result = p516.longestPalindromeSubseq(s);
        Assert.assertEquals(2,result);
    }
}
