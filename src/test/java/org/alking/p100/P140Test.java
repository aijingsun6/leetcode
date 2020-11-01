package org.alking.p100;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P140Test {

    @Test
    public void test() {
        P140 p140 = new P140();
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> res = p140.wordBreak(s, wordDict);
        Assert.assertEquals(2,res.size());

        s = "pineapplepenapple";
        wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        res = p140.wordBreak(s, wordDict);
        Assert.assertEquals(3,res.size());

    }
}
