package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P692Test {

    @Test
    public void test(){
        P692 p692 = new P692();
        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> result = p692.topKFrequent(words,k);
        Assert.assertEquals(2,result.size());
        Assert.assertEquals("i",result.get(0));
        Assert.assertEquals("love",result.get(1));
    }
}
