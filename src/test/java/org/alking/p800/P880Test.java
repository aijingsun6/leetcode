package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P880Test {

    @Test
    public void test(){
        P880 p880 = new P880();
        String s = "leet2code3";
        int k = 10;
        String result = p880.decodeAtIndex(s,k);
        Assert.assertEquals("o",result);

        s = "ha22";
        k = 5;
        result = p880.decodeAtIndex(s,k);
        Assert.assertEquals("h",result);

        s = "a2345678999999999999999";
        k = 1;
        result = p880.decodeAtIndex(s,k);
        Assert.assertEquals("a",result);
    }
}
