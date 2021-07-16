package org.alking.p400;

import org.junit.Assert;
import org.junit.Test;

public class P495Test {

    @Test
    public void test(){
        P495 p495 = new P495();
        int[] timeSeries= new int[]{1,4};
        int duration = 2;
        int result = p495.findPoisonedDuration(timeSeries,duration);
        Assert.assertEquals(4,result);
        timeSeries= new int[]{1,2};
        duration = 2;
        result = p495.findPoisonedDuration(timeSeries,duration);
        Assert.assertEquals(3,result);

    }
}
