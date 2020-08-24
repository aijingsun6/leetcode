package org.alking.easy;

import org.junit.Assert;
import org.junit.Test;

public class DecodeStringTest {

    @Test
    public void decodeString2Test(){
        DecodeString ds = new DecodeString();
        Assert.assertEquals("aaa",ds.decodeString("3","a"));
        Assert.assertEquals("abbb",ds.decodeString("a3","b"));
    }

    @Test
    public void decodeStringTest(){
        DecodeString ds = new DecodeString();
        Assert.assertEquals("aaabcbc",ds.decodeString("3[a]2[bc]"));
        Assert.assertEquals("accaccacc",ds.decodeString("3[a2[c]]"));
        Assert.assertEquals("aaabFFFFcbFFFFc",ds.decodeString("3[a]2[b4[F]c]"));
    }
}
