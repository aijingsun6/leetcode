package org.alking.p1100;

import org.junit.Assert;
import org.junit.Test;

public class P1143Test {

    @Test
    public void test(){
        P1143 p1143 = new P1143();
        int result = p1143.longestCommonSubsequence("abcde","ace");
        Assert.assertEquals(3,result);
        result = p1143.longestCommonSubsequence("abc","abc");
        Assert.assertEquals(3,result);
        result = p1143.longestCommonSubsequence("abc","def");
        Assert.assertEquals(0,result);

        result = p1143.longestCommonSubsequence("bl","yby");
        Assert.assertEquals(1,result);

    }
}
