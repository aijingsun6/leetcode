package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1544Test {

    @Test
    public void test(){
        P1544 p1544 = new P1544();
        String s = "leEeetcode";

        String result = p1544.makeGood(s);
        String expect = "leetcode";
        Assert.assertEquals(expect, result);

        s = "abBAcC";
        result = p1544.makeGood(s);
        expect = "";
        Assert.assertEquals(expect, result);

    }
}
