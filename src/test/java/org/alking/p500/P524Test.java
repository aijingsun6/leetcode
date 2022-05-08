package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P524Test {

    @Test
    public void test(){
        P524 p524 = new P524();
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale","apple","monkey","plea");
        String res = p524.findLongestWord2(s,dictionary);
        Assert.assertEquals("apple",res);

        s = "abpcplea";
        dictionary = Arrays.asList("a","c","d","b");
        res = p524.findLongestWord2(s,dictionary);
        Assert.assertEquals("a",res);
    }
}
