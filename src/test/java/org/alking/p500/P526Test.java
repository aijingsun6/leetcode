package org.alking.p500;

import org.junit.Assert;
import org.junit.Test;

public class P526Test {

    @Test
    public void test(){
        P526 p526 = new P526();
        int n = 2;
        int result = p526.countArrangement(n);
        Assert.assertEquals(2,result);
    }
}
