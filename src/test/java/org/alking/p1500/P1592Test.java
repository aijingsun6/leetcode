package org.alking.p1500;

import org.junit.Assert;
import org.junit.Test;

public class P1592Test {

    @Test
    public void test(){
        P1592 p1592 = new P1592();
        String s= "  this   is  a sentence ";
        String r = p1592.reorderSpaces(s);
        Assert.assertEquals("this   is   a   sentence",r);
    }
}
