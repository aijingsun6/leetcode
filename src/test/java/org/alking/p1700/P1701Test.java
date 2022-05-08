package org.alking.p1700;

import org.junit.Assert;
import org.junit.Test;

public class P1701Test {

    @Test
    public void test(){
        P1701 p1701 = new P1701();
        int[][] customers = new int[][]{
                {5,2},{5,4},{10,3},{20,1}
        };
        double wait = p1701.averageWaitingTime(customers);
        double expect = 3.25;
        Assert.assertEquals(expect,wait,0.001d);
    }
}
