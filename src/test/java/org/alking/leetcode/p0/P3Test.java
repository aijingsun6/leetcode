package org.alking.leetcode.p0;

import org.junit.Assert;
import org.junit.Test;

public class P3Test {

    @Test
    public void test(){
        P3 p3 = new P3();
        String s = "abcabcbb";
        int r = p3.lengthOfLongestSubstring(s);
        int e = 3;
        Assert.assertEquals(e, r);
        s = "bbbbb";
        r = p3.lengthOfLongestSubstring(s);
        e = 1;
        Assert.assertEquals(e, r);

        s = "pwwkew";
        r = p3.lengthOfLongestSubstring(s);//wke or kew
        e = 3;
        Assert.assertEquals(e, r);

    }
}
