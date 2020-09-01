package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P486Test {

    @Test
    public void test(){

        P486 p486 = new P486();
        int[] nums = new int[]{1,5,2};
        Assert.assertFalse(p486.PredictTheWinner(nums));
        nums = new int[]{1, 5, 233, 7};
        Assert.assertTrue(p486.PredictTheWinner(nums));
    }
}
