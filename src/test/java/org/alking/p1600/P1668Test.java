package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

public class P1668Test {

    @Test
    public void test() {
        P1668 p1668 = new P1668();
        String s = "ababc";
        String t = "ba";
        int result = p1668.maxRepeating(s, t);
        Assert.assertEquals(1, result);

        s = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        t = "aaaba";
        // aaaba aaaba aaba aaaba aaaba aaaba aaaba
        result = p1668.maxRepeating(s, t);
        Assert.assertEquals(5, result);
    }
}
