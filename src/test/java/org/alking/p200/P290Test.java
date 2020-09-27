package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P290Test {

    @Test
    public void test(){
        P290 p = new P290();
        Assert.assertFalse(p.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(p.wordPattern("abba", "dog dog dog dog"));
    }
}
