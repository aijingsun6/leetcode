package org.alking.p1000;

import org.junit.Assert;
import org.junit.Test;

public class P1030Test {

    @Test
    public void test(){
        P1030 p1030 = new P1030();
        int[][] res = p1030.allCellsDistOrder(2,2,0,1);
        Assert.assertEquals(4,res.length);

        res = p1030.allCellsDistOrder(80,57,19,38);
    }
}
