package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

public class P295Test {
    @Test
    public void test(){

        P295.MedianFinder mf = new P295.MedianFinder();
        for(int i = 0; i < 10;i ++){
            mf.addNum(i);
        }
        double result = mf.findMedian();
        Assert.assertEquals(4.5,result,0.001);
    }
}
