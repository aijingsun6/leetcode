package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2042Test {

    @Test
    public void test(){
        String s= "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        P2042 p2042 = new P2042();
        boolean r = p2042.areNumbersAscending(s);
        Assert.assertTrue(r);

        s = "hello world 5 x 5";
        r = p2042.areNumbersAscending(s);
        Assert.assertTrue(!r);
    }
}
