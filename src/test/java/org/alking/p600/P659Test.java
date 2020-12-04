package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P659Test {

    @Test
    public void test(){
        int[] array = new int[]{1,2,3,3,4,5};
        P659 p659 = new P659();
        Assert.assertTrue(p659.isPossible(array));

        array = new int[]{1,2,3,3,4,4,5,5};
        Assert.assertTrue(p659.isPossible(array));

        array = new int[]{1,2,3,4,4,5,};
        Assert.assertFalse(p659.isPossible(array));
    }
}
