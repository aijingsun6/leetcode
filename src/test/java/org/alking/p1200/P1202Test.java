package org.alking.p1200;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P1202Test {

    @Test
    public void test(){
        P1202 p1202 = new P1202();
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(
                Arrays.asList(0,3),
                Arrays.asList(1,2),
                Arrays.asList(0,2)
        );
        String result = p1202.smallestStringWithSwaps(s, pairs);
        Assert.assertEquals("abcd",result);

    }
}
