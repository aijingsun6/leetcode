package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P400Test {

    @Test
    public void test(){
        P400 p400 = new P400();
        int n = p400.findNthDigit(3);
        Assert.assertEquals(3,n);

        n = p400.findNthDigit(11);
        Assert.assertEquals(0,n);

        n = p400.findNthDigit(12);
        Assert.assertEquals(1,n);

        n = p400.findNthDigit(28);
        Assert.assertEquals(1,n);

        n = p400.findNthDigit(100);
        Assert.assertEquals(5,n);

    }
}
