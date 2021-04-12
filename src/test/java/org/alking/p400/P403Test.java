package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P403Test {

    @Test
    public void test(){
        P403 p403 = new P403();
        int[] stones = new int[]{0,1,3,5,6,8,12,17};
        boolean result = p403.canCross(stones);
        Assert.assertTrue(result);

        stones = new int[]{0,1,2,3,4,8,9,11};
        result = p403.canCross(stones);
        Assert.assertFalse(result);

        stones = new int[]{0,1,2,3,6,7,8,9,11};
        result = p403.canCross(stones);
        Assert.assertTrue(result);
    }
}
