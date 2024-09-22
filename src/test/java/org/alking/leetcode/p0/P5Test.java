package org.alking.leetcode.p0;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P5Test {

    @Test
    public void test() {
        P5 p5 = new P5();
        String s = "babad";
        String r = p5.longestPalindrome(s);
        Set<String> expect = new HashSet<>(Arrays.asList("bab","aba"));
        Assert.assertTrue( expect.contains(r));

        s = "cbbd";
        r = p5.longestPalindrome(s);
        expect = new HashSet<>(Arrays.asList("bb"));
        Assert.assertTrue( expect.contains(r));

        s = "aaaaaa";
        r = p5.longestPalindrome(s);
        expect = new HashSet<>(Arrays.asList("aaaaaa"));
        Assert.assertTrue( expect.contains(r));

        s = "ccc";
        r = p5.longestPalindrome(s);
        expect = new HashSet<>(Arrays.asList("ccc"));
        Assert.assertTrue( expect.contains(r));
    }
}
