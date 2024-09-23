package org.alking.leetcode.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1014Test {

    @Test
    public void test(){
        P1014 p1014 = new P1014();
        int[] values = new int[]{8,1,5,2,6};
        int r = p1014.maxScoreSightseeingPair(values);
        int e = 11;
        Assert.assertEquals(e, r);

        values = new int[]{1,2};
        r = p1014.maxScoreSightseeingPair(values);
        e = 2;
        Assert.assertEquals(e, r);

        values = new int[]{2,1};
        r = p1014.maxScoreSightseeingPair(values);
        e = 2;
        Assert.assertEquals(e, r);

        values = new int[]{1,3,5};
        r = p1014.maxScoreSightseeingPair(values);
        e = 7;
        Assert.assertEquals(e, r);
    }
}
