package org.alking.strings;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {

    @Test
    public void countAndSayTest(){
        CountAndSay cas = new CountAndSay();
        Assert.assertEquals("1",cas.countAndSay(1));
        Assert.assertEquals("11",cas.countAndSay(2));
        Assert.assertEquals("21",cas.countAndSay(3));
        Assert.assertEquals("1211",cas.countAndSay(4));
        Assert.assertEquals("111221",cas.countAndSay(5));
    }
}
