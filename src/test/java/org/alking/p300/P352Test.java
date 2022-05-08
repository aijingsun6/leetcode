package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

public class P352Test {

    @Test
    public void test(){
        P352.SummaryRanges sr = new P352.SummaryRanges();
        sr.addNum(1);
        int[][] ret = sr.getIntervals();
        Assert.assertEquals(1,ret.length);
        sr.addNum(3);
        ret = sr.getIntervals();
        Assert.assertEquals(2,ret.length);

        sr.addNum(7);
        ret = sr.getIntervals();
        Assert.assertEquals(3,ret.length);

        sr.addNum(2);
        ret = sr.getIntervals();
        Assert.assertEquals(2,ret.length);


        sr.addNum(6);
        ret = sr.getIntervals();
        Assert.assertEquals(2,ret.length);
    }
}
