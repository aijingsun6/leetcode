package org.alking.p2000;

import org.junit.Assert;
import org.junit.Test;

public class P2034Test {

    @Test
    public void test(){
        P2034.StockPrice sp = new P2034.StockPrice();
        sp.update(1,10);
        sp.update(2,5);
        Assert.assertEquals(5,sp.current());
        Assert.assertEquals(10,sp.maximum());
        Assert.assertEquals(5,sp.minimum());

        sp.update(1,3);
        Assert.assertEquals(5,sp.current());
        Assert.assertEquals(5,sp.maximum());
        Assert.assertEquals(3,sp.minimum());

        sp.update(4,2);
        Assert.assertEquals(2,sp.current());
        Assert.assertEquals(2,sp.minimum());

    }
}
