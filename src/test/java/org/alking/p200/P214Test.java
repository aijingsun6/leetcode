package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P214Test {

    @Test
    public void test(){

        P214 p214 = new P214();
        String ret = p214.shortestPalindrome("aacecaaa");
        Assert.assertEquals("aaacecaaa",ret);
        ret = p214.shortestPalindrome("abcd");

        Assert.assertEquals("dcbabcd",ret);


        ret = p214.shortestPalindrome("abbacd");
        Assert.assertEquals("dcabbacd",ret);




    }
}
