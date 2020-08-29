package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

public class P605Test {

    @Test
    public void test(){
        P605 p605 = new P605();
        int[] arr = new int[]{1,0,0,0,1};
        boolean ret = p605.canPlaceFlowers(arr, 1);
        Assert.assertTrue(ret);

        arr = new int[]{0,0,1,0,1};
        ret = p605.canPlaceFlowers(arr, 1);
        Assert.assertTrue(ret);

    }
}
