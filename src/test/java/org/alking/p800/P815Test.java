package org.alking.p800;

import org.junit.Assert;
import org.junit.Test;

public class P815Test {

    @Test
    public void test() {
        P815 p815 = new P815();
        int[][] routes = new int[][]{
                {1,2,7},{3,6,7}
        };
        int source = 1;
        int target = 6;
        int result = p815.numBusesToDestination(routes,source,target);
        int expect = 2;
        Assert.assertEquals(expect,result);

        routes = new int[][]{
                {7,12},{4,5,15},{6},{15,19},{9,12,13}
        };
        source = 15;
        target = 12;
        result = p815.numBusesToDestination(routes,source,target);
        expect = -1;
        Assert.assertEquals(expect,result);
    }
}
