package org.alking.p1400;

import org.junit.Assert;
import org.junit.Test;

public class P1442Test {

    @Test
    public void test(){
        P1442 p1442 = new P1442();
        int[] arr = new int[]{2,3,1,6,7};
        int res = p1442.countTriplets(arr);
        Assert.assertEquals(4, res);

        arr = new int[]{1,1,1,1,1};
        res = p1442.countTriplets(arr);
        Assert.assertEquals(10, res);

        arr = new int[]{2,3};
        res = p1442.countTriplets(arr);
        Assert.assertEquals(0, res);

        arr = new int[]{1,3,5,7,9};
        res = p1442.countTriplets(arr);
        Assert.assertEquals(3, res);

        arr = new int[]{7,11,12,9,5,2,7,17,22};
        res = p1442.countTriplets(arr);
        Assert.assertEquals(8, res);
    }
}
