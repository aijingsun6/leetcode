package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P97Test {

    @Test
    public void test(){
        P97 p97 = new P97();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean result = p97.isInterleave(s1,s2,s3);
        Assert.assertTrue(result);
    }
}
