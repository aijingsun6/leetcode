package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P84Test {

    @Test
    public void test() {
        P84 p84 = new P84();
        int[] heights = new int[]{2,1,5,6,2,3};
        int result = p84.largestRectangleArea(heights);
        int expect = 10;
        Assert.assertEquals(expect,result);
    }
}
