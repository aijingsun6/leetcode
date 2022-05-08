package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P877Test {

    @Test
    public void test(){
        P877  p877 = new P877();
        int[] piles = new int[]{5,3,4,5};
        boolean result = p877.stoneGame(piles);
        Assert.assertTrue(result);
    }
}
