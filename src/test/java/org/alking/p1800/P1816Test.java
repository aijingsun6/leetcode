package org.alking.p1800;

import org.junit.Assert;
import org.junit.Test;

public class P1816Test {

    @Test
    public void test(){
        P1816 p1816 = new P1816();
        String s= "Hello how are you Contestant";
        int n = 4;
        String ret = p1816.truncateSentence(s,n);
        String exp = "Hello how are you";
        Assert.assertEquals(exp,ret);
    }
}
