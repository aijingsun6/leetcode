package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P60Test {

    @Test
    public void test(){
        P60 p60 = new P60();
        String ret = p60.getPermutation(3,3);
        Assert.assertEquals("213",ret);
        Assert.assertEquals("321",p60.getPermutation(3,6));
    }
}
