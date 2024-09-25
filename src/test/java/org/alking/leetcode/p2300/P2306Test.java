package org.alking.leetcode.p2300;

import org.junit.Assert;
import org.junit.Test;

public class P2306Test {

    @Test
    public void test(){
        P2306 p2306 = new P2306();
        String[] ideas = new String[]{
                "lack","back"
        };
        long r = p2306.distinctNames(ideas);
        long e = 0;
        Assert.assertEquals(e, r);

        ideas = new String[]{
                "coffee","donuts","time","toffee"
        };
        r = p2306.distinctNames(ideas);
        e = 6;
        Assert.assertEquals(e, r);
    }
}
