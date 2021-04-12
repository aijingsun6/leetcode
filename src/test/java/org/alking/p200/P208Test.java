package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P208Test {

    @Test
    public void test(){
        P208.Trie trie = new P208.Trie();
        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));   // 返回 True
        Assert.assertFalse(trie.search("app"));     // 返回 False
        Assert.assertTrue(trie.startsWith("app")); // 返回 True
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));     // 返回 True
    }
}
