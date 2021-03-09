package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1047Test {

    @Test
    public void test(){
        P1047 p1047 = new P1047();
        String result = p1047.removeDuplicates("abbaca");
        Assert.assertEquals("ca",result);
    }
}
