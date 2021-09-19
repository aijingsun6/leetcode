package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P678Test {

    @Test
    public void test(){
        P678 p678 = new P678();
        String s  = "()";
        boolean result = p678.checkValidString(s);
        Assert.assertTrue(result);
        s  = "(*)";
        result = p678.checkValidString(s);
        Assert.assertTrue(result);
        s  = "(*))";
        result = p678.checkValidString(s);
        Assert.assertTrue(result);
    }
}
