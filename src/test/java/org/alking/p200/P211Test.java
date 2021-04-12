package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P211Test {

    @Test
    public void test(){
        P211.WordDictionary wordDictionary = new P211.WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        wordDictionary.addWord("pad");

        Assert.assertTrue(wordDictionary.search("bad"));
        Assert.assertTrue(wordDictionary.search("b.."));
        Assert.assertTrue(wordDictionary.search(".ad"));
        Assert.assertFalse(wordDictionary.search("ead"));

    }
}
