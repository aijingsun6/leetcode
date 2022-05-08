package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P336Test {

    @Test
    public void test(){
        P336 p336 = new P336();
        String[] words = new String[]{"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> result = p336.palindromePairs(words);
        Assert.assertEquals(4, result.size());

        words = new String[]{"bat","tab","cat"};
        result = p336.palindromePairs(words);
        Assert.assertEquals(2, result.size());

        words = new String[]{"a",""};
        result = p336.palindromePairs(words);
        Assert.assertEquals(2, result.size());

        words = new String[]{"a","aa","aaa"};
        result = p336.palindromePairs(words);
        Assert.assertEquals(6, result.size());

    }
}
