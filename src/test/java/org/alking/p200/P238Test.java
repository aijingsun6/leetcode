package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P238Test {

    @Test
    public void test(){
        P238 p238 = new P238();
        int[] res = p238.productExceptSelf(new int[]{1,2,3,4});
        Assert.assertArrayEquals(new int[]{24,12,8,6},res);
    }
}
