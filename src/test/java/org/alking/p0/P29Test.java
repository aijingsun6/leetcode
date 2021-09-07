package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P29Test {

    @Test
    public void test(){
        P29 p29 = new P29();
        int result = p29.divide(10,3);
        Assert.assertEquals(3,result);

        result = p29.divide(7,-3);
        Assert.assertEquals(-2,result);
        // -2147483648
        //-1
        result = p29.divide(-2147483648,-1);
        Assert.assertEquals(2147483647,result);

        result = p29.divide(-2147483648,1);
        Assert.assertEquals(-2147483648,result);
    }
}
