package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P372Test {

    @Test
    public void test(){
        P372 p372 = new P372();
        int[] array = new int[]{1,0};
        int result = p372.superPow(2,array);
        Assert.assertEquals(1024,result);
        array = new int[]{4,3,3,8,5,2};
        result = p372.superPow(1,array);
        Assert.assertEquals(1,result);

        array = new int[]{2,0,0};

        result = p372.superPow(2147483647,array);
        Assert.assertEquals(1198,result);

    }
}
