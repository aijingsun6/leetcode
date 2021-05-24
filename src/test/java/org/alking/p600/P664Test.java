package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P664Test {

    @Test
    public void test() {
        P664 p664 = new P664();
        String s = "aaabbb";
        int result = p664.strangePrinter(s);
        Assert.assertEquals(2, result);

        s = "aba";
        result = p664.strangePrinter(s);
        Assert.assertEquals(2, result);

        s = "abcba";
        result = p664.strangePrinter(s);
        Assert.assertEquals(3, result);

    }
}
