package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P556Test {

    @Test
    public void test(){
        P556 p556 = new P556();
        int n = 12;
        int r = p556.nextGreaterElement(n);
        Assert.assertEquals(21,r);
        n = 158476531;
        r = p556.nextGreaterElement(n);
        Assert.assertEquals(158513467,r);

    }
}
