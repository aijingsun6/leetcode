package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P345Test {

    @Test
    public void test(){
        P345 p345 = new P345();
        String ret = p345.reverseVowels("hello");
        Assert.assertEquals("holle",ret);
    }
}
