package org.alking.p1300;

import org.junit.Assert;
import org.junit.Test;

public class P1353Test {
    @Test
    public void test(){
        P1353 p1353 = new P1353();
        int[][] events = new int[][]{
                {1,2},{2,3},{3,4},{1,2}
        };
        int result = p1353.maxEvents(events);
        Assert.assertEquals(4,result);

        events = new int[][]{{1,4},{4,4},{2,2},{3,4},{1,1}};
        result = p1353.maxEvents(events);
        Assert.assertEquals(4,result);

        events = new int[][] {{1,1},{1,2},{1,3},{1,4},{1,5},{1,6},{1,7}};
        result = p1353.maxEvents(events);
        Assert.assertEquals(7,result);


    }
}
