package org.alking.p1800;

import org.junit.Assert;
import org.junit.Test;

public class P1846Test {

    @Test
    public void test(){
        P1846 p1846 = new P1846();
        int[] arr = new int[]{100,1,1000};
        int result = p1846.maximumElementAfterDecrementingAndRearranging(arr);
        int expect = 3;
        Assert.assertEquals(expect,result);
    }
}
