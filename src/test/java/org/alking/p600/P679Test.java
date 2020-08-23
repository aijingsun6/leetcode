package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P679Test {

    @Test
    public void test(){
        P679 p679 = new P679();
        Assert.assertTrue(p679.judgePoint24(new int[]{4, 1, 8, 7}));
        boolean ret = p679.judgePoint24(new int[]{1,2,1,2});
        Assert.assertFalse(ret);

    }
}
