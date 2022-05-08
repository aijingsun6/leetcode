package org.alking.p1900;

import org.junit.Assert;
import org.junit.Test;

public class P1974Test {

    @Test
    public void test(){
        P1974 p1974 = new P1974();
        int result = p1974.minTimeToType("abc");
        Assert.assertEquals(5,result);

        result = p1974.minTimeToType("bza");
        Assert.assertEquals(7,result);
    }
}
