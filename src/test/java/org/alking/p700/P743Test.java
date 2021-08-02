package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P743Test {

    @Test
    public void test() {
        P743 p743 = new P743();

        int[][] times = new int[][]{
                {1,2,1},
                {2,3,2},
                {1,3,2}
        };
        int n = 3;
        int k = 1;
        int result = p743.networkDelayTime(times,n,k);
        Assert.assertEquals(2,result);


    }
}
