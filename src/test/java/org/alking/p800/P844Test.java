package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P844Test {

    @Test
    public void test(){
        P844 p844 = new P844();
        Assert.assertEquals("",p844.convert("ab##"));
        Assert.assertEquals("c",p844.convert("a##c"));
    }
}
